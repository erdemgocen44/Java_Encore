package oop1;

import java.util.Scanner;

public class C10_Modulus_Kalan_Bulma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen üç basamakli pozitif bir tamsayi giriniz: ");
        int sayi = scanner.nextInt();

        int sayi1 = sayi / 100;
        int sayi2 = (sayi / 10) % 10;
        int sayi3 = sayi % 10;

        System.out.println("Vermis olduğunuz sayinin rakamlari toplami: " + sayi1 + sayi2 + sayi3);
    }
}
