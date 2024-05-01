package oop1;

import java.util.Scanner;

public class C19_Switch_Statement2 {
    public static void main(String[] args) {
        /*
         * Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek
         * istedigini alin ve girilen harfin karsiligini yazdirin
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen ISTQB harflerinden birini seciniz: ");
        char harf = scanner.next().toUpperCase().charAt(0);
        switch (harf) {
            case 'I' -> System.out.println("International");
            case 'S' -> System.out.println("Software");
            case 'T' -> System.out.println("Testing");
            case 'Q' -> System.out.println("Qualifications");
            case 'B' -> System.out.println("Board");
            default -> System.out.println("Lutfen gecerli bir harf giriniz");
        }
    }
}
