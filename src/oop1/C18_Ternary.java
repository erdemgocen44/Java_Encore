package oop1;

import java.util.Scanner;

public class C18_Ternary {
    public static void main(String[] args) {
        // Kullanicidan positif bir tamsayi alin
        // sayinin tekmi cift mi oldugunu yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen positif bir tam sayi giriniz: ");
        int girilenSayi = scanner.nextInt();
        if (girilenSayi % 2 == 0)
            System.out.println("Girdiginiz " + girilenSayi + " sayisi cift bir sayidir");

        else {
            System.out.println("Girdiginiz " + girilenSayi + " sayisi tek bir sayidir");
        }

        
    }
}
