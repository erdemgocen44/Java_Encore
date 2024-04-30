package oop1;

import java.util.Scanner;

public class C18_Ternary4 {
        public static void main(String[] args) {
                /*
                 * Soru 3- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu
                 * buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin
                 * 
                 */

                Scanner scanner = new Scanner(System.in);

                System.out.println("Lütfen bir harf giriniz: ");

                char girilenHarf = scanner.next().charAt(0);

                System.out.println(Character.isLowerCase(
                                girilenHarf)
                                                ? "Girdiginiz harf kucuk ama ben büyüttüm : "
                                                                + Character.toUpperCase(girilenHarf)
                                                : Character.toUpperCase(girilenHarf));
                scanner.close();
        }
}
