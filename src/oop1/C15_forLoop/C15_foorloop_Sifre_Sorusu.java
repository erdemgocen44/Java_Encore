package oop1.C15_forLoop;

import java.util.Scanner;

public class C15_foorloop_Sifre_Sorusu {
    public static void main(String[] args) {

        /*
         * Kullanicidan isim ve soyisim ayrı ayrı girmesini isteyin
         * ismi daha uzun ise isim ve soyismi ilk harf büyük kalanlar küçük sekilde
         * yazdirin
         * soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk
         * soyismi buyuk harfle yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sirasiyla isim ve soyisminizi giriniz : ");
        String isim = scanner.nextLine();
        String soyisim = scanner.nextLine();

        if (isim.length() > soyisim.length())
            System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase() + " "
                    + soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase());
        else {
            System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase() + " "
                    + soyisim.substring(0).toUpperCase());
        }
        scanner.close();
    }
}
