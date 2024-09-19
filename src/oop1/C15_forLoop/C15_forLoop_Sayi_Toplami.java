package oop1.C15_forLoop;

import java.util.Scanner;

public class C15_forLoop_Sayi_Toplami {
    public static void main(String[] args) {
        /*
         * Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
         * sinirlar dahil olarak aralarındaki tum sayilarin toplamini yazdirin.
         * Bitis degeri baslangic degerinden kucukse,
         * uyari yazdirip islemi sonlandirin
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir baslangic sayisi giriniz : ");

        int baslangic = scanner.nextInt();

        System.out.println("Lütfen bir bitis degeri giriniz : ");

        int bitis = scanner.nextInt();

        if (bitis < baslangic) {
            System.out.println("Bitis degeri baslangic degerinden yuksek olmali");
        } else {
            int toplam = 0;
            for (int i = baslangic; i <= bitis; i++) {
                // toplam=toplam+i
                toplam += i;
            }
            System.out.println("Sinirlar arasindaki sayilarin toplami : " + toplam);
        }

    }
}
