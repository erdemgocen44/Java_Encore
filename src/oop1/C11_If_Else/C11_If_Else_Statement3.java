package oop1.C11_If_Else;

import java.util.Scanner;

public class C11_If_Else_Statement3 {
    public static void main(String[] args) {
        /*
         * Kullanicidan kilo(kg) ve boyunu (cm) isteyip vucut kitle endeksini
         * hesaplayin. (kilo *10000 /boy*boy) vucut kitle endeksi 30'dan buyukse
         * obez, 25-30 arası ise kilolu, 20-25 arasi ise normal, 20'den kucukse
         * zayif yazdirin.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen kilonuzu (kg cinsinden) giriniz : ");

        double kilo = scanner.nextDouble();

        System.out.println("Lutfen boyunuzu (cm cinsinden) giriniz : ");

        double boy = scanner.nextDouble();

        double vke = kilo * 10000 / (boy * boy);

        System.out.println("Vucut kitle endeksiniz : " + vke);
        if (vke >= 30)
            System.out.println("Obez");
        else if (vke >= 25)
            System.out.println("Kilolu");
        else if (vke >= 20)
            System.out.println("Normal");
        else if (vke >= 0)
            System.out.println("Zayif");
        else
            System.out.println("Yanlis deger girdiniz");

        scanner.close();
    }
}
