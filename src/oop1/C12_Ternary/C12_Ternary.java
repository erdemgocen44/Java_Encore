package oop1.C12_Ternary;

import java.util.Scanner;

public class C12_Ternary {
    public static void main(String[] args) {
        // Kullanicidan positif bir tamsayi alin
        // sayinin tekmi cift mi oldugunu yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen positif bir tam sayi giriniz: ");
        int girilenSayi = scanner.nextInt();

        System.out.println(girilenSayi % 2 == 0 ? "Girilen sayi cifttir" : "Girilen sayi tektir");

    }
}
