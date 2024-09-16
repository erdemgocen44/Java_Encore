package oop1.C14_String_Manupulations;

import java.util.Scanner;

public class C14_Soru {
    public static void main(String[] args) {
        /*
         * SORU: kullanicidan bir mail alin
         * - mail@icermiyorsa "gecersiz mail"
         * -mail @gmail.com icermiyorsa, "mail gmail olmali"
         * -mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir mail adresi giriniz : ");

        String mail = scanner.nextLine();

        if (!mail.contains("mail"))
            System.out.println("Gecersiz mail.Tekrar deneyiniz!");
        else if (!mail.contains("@gmail.com"))
            System.out.println("Verdiginiz mail gmail olmali");
        else if (!mail.endsWith("@gmail.com"))
            System.out.println("Mailde yazim hatasi olustu.Lutfen tekrar deneyiniz");
        else if (!mail.endsWith(".com"))
            System.out.println("Mail '.com' ile bitmeli");

        else
            System.out.println("Mail adresiniz : " + mail);

    }
}
