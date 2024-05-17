package oop1.C15_forLoop;

import java.util.Scanner;

public class C15_forLoop_Sayilarin_Rakamlarinin_Toplami {
    public static void main(String[] args) {

        // Kullanicidan positif bir tamsayi alip
        // rakamlar toplamini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen rakamlari toplami icin bir sayi giriniz: ");

        int sayi = scanner.nextInt();

        int toplam = 0;

        for (int i = sayi; i > 0; i /= 10) {
            toplam += i % 10;

        }

        System.out.println("Girilen sayinin rakamlar toplami: " + toplam);
        scanner.close();
    }
}
