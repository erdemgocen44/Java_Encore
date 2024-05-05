package oop1.C13_;

import java.util.Scanner;

public class C13_Switch_Statement2 {
    public static void main(String[] args) {
        /*
         * Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek
         * istedigini alin ve girilen harfin karsiligini yazdirin
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen anlamini ogrenmek istediginiz \nISTQB harflerinden birini seciniz: ");
        char harf = scanner.next().toUpperCase().charAt(0);
        switch (harf) {
            case 'I' -> System.out.println("International");
            case 'S' -> System.out.println("Software");
            case 'T' -> System.out.println("Testing");
            case 'Q' -> System.out.println("Qualifications");
            case 'B' -> System.out.println("Board");
            default -> System.out.println("Lutfen gecerli bir harf giriniz");
        }
        scanner.close();
    }
}
