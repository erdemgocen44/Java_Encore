package oop1.C15_forLoop;

import java.util.Scanner;

public class C15_forLoop_Sayilari_Topla {
    public static void main(String[] args) {
        /*
         * Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.
         * Orn : 6543 ==> 1+6+5+4+3 = 16
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir sayi giriniz: ");

        int girilenSayi = scanner.nextInt();

        int sayi = girilenSayi;

        int birlerBasamagi = 0;

        int rakamlarToplami = 0;

        int basamakSayisi = (sayi + "").length();

        for (int i = 1; i <= basamakSayisi; i++) {
            birlerBasamagi = sayi % 10;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10;
        }

        System.out.println("Verdiginiz " + girilenSayi + " sayisinin rakamlari toplami : " + rakamlarToplami);
    }
}
