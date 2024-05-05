package oop1.C13_;

import java.util.Scanner;

public class C13_Switch_Statement {
    public static void main(String[] args) {
        // Kullnicidan ay numarasini alin ve ayin ismini yazdirin
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen ay numarasini giriniz: ");
        int ay = scanner.nextInt();

        switch (ay) {
            case 1 -> System.out.println("Ocak");
            case 2 -> System.out.println("Subat");
            case 3 -> System.out.println("Mart");
            case 4 -> System.out.println("Nisan");
            case 5 -> System.out.println("Mayis");
            case 6 -> System.out.println("Haziran");
            case 7 -> System.out.println("Temmuz");
            case 8 -> System.out.println("Agustos");
            case 9 -> System.out.println("Eylul");
            case 10 -> System.out.println("Ekim");
            case 11 -> System.out.println("Kasim");
            case 12 -> System.out.println("Aralik");

            default -> System.out.println("Lutfen gecerli bir sayi giriniz");
        }

    }
}
