package oop1;

import java.util.Scanner;

public class C16_If5_Soru_Cozumu {
    public static void main(String[] args) {
        /*
         * Kullanicidan bir ucgenin 3 kenar uzunluğunu alin
         * ucken eskenar ise "Eskenar ucken yazdirin"
         * javada 3lu karsılastirma olmaz
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ucgenin uc kenar uzunluklarini giriniz: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == b && a == c && b == c)
            System.out.println("Bu bir eskenar uckendir");
        if (a == 0 || b == 0 || c == 0)
            System.out.println("Girilen deger 0'dan buyuk olmali!!");
        if (a < 0 || b < 0 || c < 0)
            System.out.println("Girilen deger eksi (-) bir sayi olamaz!!");
        else
            System.out.println("Bu bir eskenar ucken degildir");

    }
}
