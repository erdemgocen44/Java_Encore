package oop1.C15_forLoop;

import java.util.Scanner;

public class C15_forLoop1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 5'er 5'er artirmak icin bir sayi giriniz: ");

        int girilenSayi = scanner.nextInt();

        for (int i = girilenSayi; i <= 100; i += 5)
            System.out.print(i + " ,");

        System.out.println("*****************************************");
        // 100 den baslayip 1'e kadar geri geri gidin
        // 7'nin kati olan sayilari yazdirin

        for (int i = 100; i >= 1; i--) {
            if (i % 7 == 0)
                System.out.print(i + ", ");

        }

    }
}
