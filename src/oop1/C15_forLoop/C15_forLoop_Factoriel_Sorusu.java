package oop1.C15_forLoop;

import java.util.Scanner;

public class C15_forLoop_Factoriel_Sorusu {
    public static void main(String[] args) {

        // Kullanicidan 20 den kucuk bir sayi alip
        // bu sayinin factoriyel degerini hesaplayalım

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 20'den kucuk bir tam sayi giriniz: ");

        int sayi = scanner.nextInt();

        int factoriel = 1;

        for (int i = 0; i < sayi; i++) {
            System.out.println(i);
            int sayi = sayi * sayi;
        }

    }
}
