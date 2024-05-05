package oop1.C11_If_Else;

import java.util.Scanner;

public class C11_If_Else_Statement1 {
    public static void main(String[] args) {
        /*
         * Ogrencinin notu 85 ve ustu ise AA,
         * (85 ve ustu değilse) 65 ve ustu ise BB,
         * (65 ve ustu değilse) 50 ve ustu ise CC,
         * Aksi takdirde DD
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen notunuzu sayı olarak giriniz: ");

        double girilenNot = scanner.nextDouble();

        if (girilenNot >= 85 && girilenNot <= 100)
            System.out.println("Çok iyi, notunuz AA'dir");
        else if (girilenNot >= 65 && girilenNot <= 84)
            System.out.println("Tebrikler, notunuz BB'dir");
        else if (girilenNot >= 50 && girilenNot <= 64)
            System.out.println("Notunuz CC'dir");
        else if (girilenNot >= 0 && girilenNot <= 49)
            System.out.println("Maalesef, notunuz DD'dir");
        else
            System.out.println("Lütfen geçerli bir not giriniz");
        scanner.close();
    }
}
