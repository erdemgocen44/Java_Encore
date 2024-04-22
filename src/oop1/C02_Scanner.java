package oop1;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen bir ondalikli sayi giriniz : ");
        double girilenOndalik = scanner.nextDouble();

        System.out.print("Lutfen bir tam sayi giriniz : ");
        int girilenTam = scanner.nextInt();

        System.out.println("Girilen sayilarin çarpimi= " + girilenOndalik * girilenTam);
        System.out.println("Girilen sayilarin toplami= " + (girilenOndalik + girilenTam));
        scanner.close();
    }
}
