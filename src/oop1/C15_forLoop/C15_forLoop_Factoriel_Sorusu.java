package oop1.C15_forLoop;

import java.util.Scanner;

public class C15_forLoop_Factoriel_Sorusu {
    public static void main(String[] args) {

        // Kullanicidan 20 den kucuk bir sayi alip
        // bu sayinin factoriyel degerini hesaplayalım

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 20'den kucuk bir tam sayi giriniz: ");

        int sayi = scanner.nextInt();

        int carpim = 1;

        for (int i = 1; i <= sayi; i++) {
            carpim *= i;
        }
        System.out.println("Girilen sayi olan " + sayi + "! = " + carpim);
        scanner.close();
    }
}
