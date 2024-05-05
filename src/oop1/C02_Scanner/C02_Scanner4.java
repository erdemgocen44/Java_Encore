package oop1.C02_Scanner;

import java.util.Scanner;

public class C02_Scanner4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen birinci sayiyi giriniz: ");
        int birinci = scanner.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz: ");
        int ikinci = scanner.nextInt();

        int temp = birinci;
        birinci = ikinci;
        ikinci = temp;
        System.out.println("Degisiklik sonrasi birinci sayi: " + birinci + ", ikinci sayi ise: " + ikinci);

        scanner.close();
    }
}
