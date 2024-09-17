package oop1.C15_forLoop;

import java.util.Scanner;

public class C15_forLoop_sifreSorusu {
    public static void main(String[] args) {
        /*
         * //Soru 4: Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
         * ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
         * - eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
         * - ilk harf kucuk harf olmali
         * - son karakter rakam olmali
         * - sifre bosluk icermemeli
         * - uzunlugu en az 10 karakter olmali I
         */

        boolean flag = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen sifrenizi giriniz: ");

        String sifre = scanner.nextLine();

        char ilkHarf = sifre.charAt(0);

        char sonKarakter = sifre.charAt(sifre.length() - 1);

        if (!(ilkHarf >= 'a' && ilkHarf <= 'z'))
            System.out.println("Ilk harf küçük harf olmalı");
        flag = false;

        if (!(sonKarakter >= '0' && sonKarakter <= '9'))
            System.out.println("Son karakter sayi olmali");
        flag = false;

        if (sifre.contains(" "))
            System.out.println("Sifre bosluk icermemeli");
        flag = false;
    }
}
