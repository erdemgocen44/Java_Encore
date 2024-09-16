package oop1.C11_If_Else;

import java.util.Scanner;

public class C11_If_Else_Musteri_Sorusu {
    public static void main(String[] args) {
        /*
         * Kullanicidan aldigi urun adedi ve liste fiyatini alin
         * kullaniciya musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen aldiginiz urun adedini giriniz: ");
        int urunAdedi = scanner.nextInt();

        System.out.println("Lütfen aldiginiz urun listesinin fiyatini giriniz: ");
        double listeFiyati = scanner.nextDouble();

        System.out.println("Urun kartiniz var mi? \nEvet: 'E' Hayir: 'H' ");
        char musteriKarti = scanner.next().toUpperCase().charAt(0);
        if (musteriKarti == 'E') {
            if (urunAdedi >= 10)
                System.out.println(
                        "Tebrikler %20 indirim kazandiniz\nKasa toplaminiz: " + listeFiyati * urunAdedi * 0.8);
            else {
                System.out.println("%15 indirim kazandiniz\nKasa toplaminiz: "
                        + listeFiyati * urunAdedi * 0.15);
            }
        } else if (musteriKarti == 'H') {
            if (urunAdedi >= 10) {
                System.out.println(
                        "%15 indirim kazandiniz\nKasa toplaminiz: " + listeFiyati * urunAdedi * 0.85);
            } else
                System.out.println("%10 indirim kazandiniz\nKasa toplaminiz: "
                        + listeFiyati * urunAdedi * 0.9);

        } else {
            System.out.println("Lutfen gecerli bir karakter giriniz");
        }
        scanner.close();
    }

}
