package oop1.C02_Scanner;

import java.util.Scanner;

public class C02_Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz: ");
        char isim = scanner.nextLine().charAt(0);

        System.out.println("Lutfen soyisminizi giriniz: ");
        String soyisim = scanner.nextLine().substring(0, 3);

        System.out.println("Lutfen yasinizi giriniz: ");
        int yas = scanner.nextInt();

        System.out.println("Girilen bilgilere göre :  " + isim + " " + soyisim + ", " + yas);

        scanner.close();
    }
}
