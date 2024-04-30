package oop1;

import java.util.Scanner;

public class C17_If_Else_Musteri_Sorusu {
    public static void main(String[] args) {
        /*
         * Kullanicidan aldigi urun adedi ve liste fiyatini alin
         * kullaniciya musteri karti olup olmadigini sorun
         * Musteri karti varsa ve urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen aldiginiz urun adedini giriniz: ");
        int urunAdedi = scanner.nextInt();

        System.out.println("Lütfen aldiginiz urun listesinin fiyatini giriniz: ");
        double listeFiyati = scanner.nextDouble();

        System.out.println("Urun kartiniz var mi? Evet icin 'E' hayir 'H' giriniz: ");
        boolean musteriKarti = scanner.nextBoolean();

        

    }
}
