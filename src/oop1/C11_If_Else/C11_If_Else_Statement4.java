package oop1.C11_If_Else;

import java.util.Scanner;

public class C11_If_Else_Statement4 {
    public static void main(String[] args) {
        /*
         * Kullnicidan cinsiyetini ve yasini alin
         * Kadin, 60 yas ve uzeri, Erkek 65 yas ve uzeri emekli olabilir.
         * Cinsiyet ve yasini dikkate alarak 'Emekli olabilir' veya
         * 'Emekli olmak için .... yil calisman lazim' yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi Erkek 'E' ya da Kadin icin 'K' olarak giriniz: ");

        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yasinizi giriniz: ");

        int yas = scanner.nextInt();

        if (cinsiyet == 'K' && yas >= 60 || cinsiyet == 'E' && yas >= 65) { //
            System.out.println("Tebrikler emekli olabilirsiniz!");
        } else if (cinsiyet == 'E' && yas <= 64) {
            System.out.println("Maalesef emekli olmak icin " + (65 - yas) + " yil daha calismaniz gerekir.");
        } else
            System.out.println("Maalesef emekli olmak icin " + (60 - yas) + " yil daha calismaniz gerekir");
        scanner.close();
    }
}