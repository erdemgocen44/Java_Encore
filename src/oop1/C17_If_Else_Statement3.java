package oop1;

import java.util.Scanner;

public class C17_If_Else_Statement3 {
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

    }
}
