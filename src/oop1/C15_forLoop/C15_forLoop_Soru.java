package oop1.C15_forLoop;

import java.util.Scanner;

public class C15_forLoop_Soru {
    public static void main(String[] args) {
        // Soru 5: Kullanicidan isim ve soyismini ayri ayri alin.
        // - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        // yazdirin
        // soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        // harflerle yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz: ");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz: ");
        String soyisim = scanner.nextLine();

        if (isim.length() > soyisim.length())
            System.out.println(isim.charAt(0) + "," + soyisim.charAt(0));

    }
}
