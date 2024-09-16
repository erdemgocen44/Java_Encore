package oop1.C15_forLoop;

import java.util.Scanner;

public class C15_forLoop_AsalSayiKontrol {
    public static void main(String[] args) {
        // Kullanicidan positif bir tamsayi isteyin
        // sayinin asal olup olmadigini kontrol edin ve sonucu yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz: ");
        int sayi = scanner.nextInt();
        boolean flag = true;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0)
                System.out.println(sayi + " sayisi asal degil");
            flag = false;
            break;
        }
        if (flag)

            System.out.println(sayi + " sayisi asal bir sayidir.");

    }
}
