package oop1.C05_Modulus;

import java.util.Scanner;

public class C05_Modulus_Kalan_Bulma2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz: ");
        int girilenSayi = scanner.nextInt();

        int sayi = girilenSayi;

        int birlerBasamagi = 0;

        int rakamlarToplami = 0;

        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;

        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;

        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;

        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;
       
        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;
       
        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;
       
        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;
       
        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;
        
        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;
       
        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;
       
        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;
        
        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;
        
        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;
       
        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;
       
        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;

        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10; // 4.rakamdan kucuk olur.

        System.out.println(girilenSayi + " sayisinin rakamlar toplami: " + rakamlarToplami);

        scanner.close();
    }
}
