package oop1.C15_forLoop;

import java.util.Scanner;

public class C15_forLoop_Sayi_Sorusu {
    public static void main(String[] args) {

        /*
         * Soru 3- Kullanicidan baslangic ve bitis degeri olarak
         * pozitif sayilar alin, sinirlar dahil olarak aralarindaki
         * tum sayilarin toplamini yazdirin. Bitis degeri baslangic
         * degerinden kucukse, uyari yazdirip islemi sonlandirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir baslangic degeri girin: ");
        int baslangic = scanner.nextInt();
        System.out.println("Lutfen bitis degerini girin: ");
        int bitis = scanner.nextInt();

        scanner.close();

    }
}
