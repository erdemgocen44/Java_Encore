package oop1.C12_Ternary;

import java.util.Scanner;

public class C12_Ternary2 {
    public static void main(String[] args) {
        /*
         * VERİLEN SAYİCİFT İSE 'CİFT SAYİ'
         * TEK SAYİ İSE 2*INPUTSONUCUNU VEREN TERNARY YAZALIM
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz");

        int girilenSayi = scanner.nextInt();

        System.out.println(girilenSayi % 2 == 0 ? girilenSayi + " sayisi bir cift sayidir" : 2 * girilenSayi);

        scanner.close();
    }
}
