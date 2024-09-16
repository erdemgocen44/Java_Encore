package oop1.C15_forLoop;

import java.util.Scanner;

public class C15_forLoop_Sifre_Sorusu {
    public static void main(String[] args) {
        /*
         * Soru 4: Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
         * ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
         * eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
         * - ilk harf kucuk harf olmali
         * - son karakter rakam olmali
         * - sifre bosluk icermemeli
         * - uzunlugu en az 10 karakter olmali
         * flag yontemini kullanalim
         * flag basta true olsun ve her uygun olmayan
         * durumda false degeri atayalim
         */
        boolean flag = true;
        // sartlar birbirinden bagimsiz oldugundan
        // bagimsiz if ifadeleri kullanalim

        // - ilk harf kucuk harf olmali

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen sifrenizi giriniz: ");

        String sifre = scanner.nextLine();

        char ilkHarf = sifre.charAt(0);

        if (!(ilkHarf >= 'a' && ilkHarf <= 'z'))
            System.out.println("Ilk harf kucuk harf olmali");
        flag = false;

        // son karakter rakam olmali

        char sonKarakter = sifre.charAt(sifre.length() - 1);

        if (!(sonKarakter >= '0' && sonKarakter <= '9'))
            System.out.println("Son karakter rakam olmali");
        flag = false;

        // sifre bosluk icermemeli

        if (sifre.contains(" "))
            System.out.println("Sifre bosluk icermemeli");
        flag = false;

        // uzunlugu en az 10 karakter olmali

        if (!(sifre.length() >= 10))
            System.out.println("Sifre en az 10 karakter olmali");
        flag = false;

        System.out.println("Sifreniz basarili sekilde kaydedildi: " + sifre);
        scanner.close();
    }
}
