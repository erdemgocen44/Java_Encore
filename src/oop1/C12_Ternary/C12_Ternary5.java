package oop1.C12_Ternary;

import java.util.Scanner;

public class C12_Ternary5 {
    public static void main(String[] args) {
        /*
         * Soru 4- Kullanicidan notunu alin 50 veya daha buyukse "Sinifi Gectin", 50'den
         * kucukse "Maalesef kaldin" yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz: ");
        int not = scanner.nextInt();

        System.out.println(not >= 50 ? "Tebrikler sinifi gectiniz" : "Maalesef kaldiniz :(");

        scanner.close();
    }
}
