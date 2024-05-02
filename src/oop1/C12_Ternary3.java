package oop1;

import java.util.Scanner;

public class C12_Ternary3 {
    public static void main(String[] args) {
        /*
         * Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
         * "Eskenar ucgen" yazdirin, degilse "Eskenar degil" yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sirasiyla uckenin kenar uzunluklarini giriniz: ");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println(a == b && b == c && a == c ? "Bu bir eskenar uckendir" : "Bu bir eskenar ucken degildir");

    }
}
