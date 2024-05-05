package oop1.C14_String_Manupulations;

import java.util.Scanner;

public class C14_String_Manupulation3 {
    public static void main(String[] args) {
        /*
         * kullanicidan ismini isteyin
         * ve ortasindaki harfi yazdirin
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz: ");
        String isim = scanner.nextLine();

        int uzunluk = isim.length();

        if (uzunluk % 2 == 0)
            System.out
                    .println("Isminizin ortasindaki harf : " + isim.charAt(uzunluk / 2 - 1) + isim.charAt(uzunluk / 2));
        else
            System.out.println("Isminizin ortasindaki harf : " + isim.charAt(isim.length() / 2));
    }
}
