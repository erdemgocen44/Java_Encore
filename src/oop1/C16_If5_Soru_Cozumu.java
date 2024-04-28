package oop1;

import java.util.Scanner;

public class C16_If5_Soru_Cozumu {
    public static void main(String[] args) {
        /*
         * Kullanicidan bir ucgenin 3 kenar uzunluğunu alin
         * ucken eskenar ise "Eskenar ucken yazdirin"
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ucgenin uc kenar uzunluklarini giriniz: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && a == c && b == c)
            System.out.println("Bu bir eskenar uckendir");
        else
            System.out.println("Bu bir eskenar ucken degildir");

    }
}
