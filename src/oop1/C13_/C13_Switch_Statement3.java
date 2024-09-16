package oop1.C13_;

import java.util.Scanner;

public class C13_Switch_Statement3 {
    public static void main(String[] args) {
        /*
         * Kullanicidan bir gun numarasi alin
         * numaraya gore haftaici yada hafta sonu yazdirin
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir gun numarasi giriniz: ");

        int numara = scanner.nextInt();

        switch (numara) {
            case 1 -> System.out.println("Haftaici-Pazartesi");
            case 2 -> System.out.println("Haftaici-Sali");
            case 3 -> System.out.println("Haftaici-Carsamba");
            case 4 -> System.out.println("Haftaici-Persembe");
            case 5 -> System.out.println("Haftaici-Cuma");
            case 6 -> System.out.println("Haftasonu-Cumartesi");
            case 7 -> System.out.println("Haftasonu-Pazar");

            default -> System.out.println("Lutfen gecerli bir sayi giriniz");

        }
    }
}
