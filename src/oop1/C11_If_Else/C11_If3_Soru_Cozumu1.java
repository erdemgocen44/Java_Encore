package oop1.C11_If_Else;

import java.util.Scanner;

public class C11_If3_Soru_Cozumu1 {
    public static void main(String[] args) {
        /*
         * kullanıcıdan bir sayı isteyin, sayıyı kontrol edip
         * 5 ile bölünüyorsa, 5 ile bölünen sayıyı ekrana yazdırın
         * 5 ile bölünmüyorsa, ekrana "5 ile bölünmez" yazdırın
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen bir sayi giriniz : ");
        int sayi = scanner.nextInt();

        if (sayi % 5 == 0)
            System.out.println("Bu " + sayi + " sayisi 5 ile bölünebilir ");
        else
            System.out.println("Bu " + sayi + " sayisi 5 ile bölünemez ");
        scanner.close();
    }
}
