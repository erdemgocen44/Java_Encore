package oop1.C15_forLoop;

import java.util.Scanner;

public class C15_forLoop1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 5'er 5'er artirmak icin bir sayi giriniz: ");

        int girilenSayi = scanner.nextInt();

        for (int i = girilenSayi; i <= 100; i += 5) {
            System.out.print(i);

        }
    }
}
