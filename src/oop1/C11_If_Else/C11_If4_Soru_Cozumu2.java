package oop1.C11_If_Else;

import java.util.Scanner;

public class C11_If4_Soru_Cozumu2 {
    public static void main(String[] args) {

        /*
         * Kullanicidan bir sayi alin, sayi 3'un kati ise ekrana "Sayi 3'un kati"
         * yazdirin,
         * sayi 5 ile bolunebiliyorsa ekrana "Sayi 5 ile bolunebiliyor" yazdirin,
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz : ");

        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3 == 0) {
            System.out.println(girilenSayi + " sayisi 3'un katidir");
        } else if (girilenSayi % 5 == 0) {
            System.out.println(girilenSayi + " sayisi 5'in katidir");
        } else {
            System.out.println(girilenSayi + " sayisi 3 veya 5 ile bolunemez");
        }
        scanner.close();
    }
}
