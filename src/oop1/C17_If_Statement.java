package oop1;

import java.util.Scanner;

public class C17_If_Statement {
    public static void main(String[] args) {
        /*
         * Kullanıcidan bir harf girmesini isteyin
         * girilen harfin buyuk yada kucuk harf oldugunu yazdirin
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz : ");

        char harf = scanner.next().charAt(0);

        if (Character.isUpperCase(harf))
            System.out.println(harf + " harfi buyuk harftir");
        else if (Character.isLowerCase(harf))
            System.out.println(harf + " harfi kucuk harftir");
        else
            System.out.println("Lutfen gecerli bir harf giriniz");
    }
}
