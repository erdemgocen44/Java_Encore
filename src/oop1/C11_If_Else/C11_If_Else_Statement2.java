package oop1.C11_If_Else;

import java.util.Scanner;

public class C11_If_Else_Statement2 {
    public static void main(String[] args) {
        /*
         * Kullanicidan bir tam sayi isteyin
         * Sayi 3'e bolunuyorsa 3'un katı,
         * Sayi 5'e bolunuyorsa 5'un katı,
         * ikisine birden bolunuyorsa super sayi,
         * ikisine birden bolunmuyorsa yaramaz sayi yazdirin
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi % 3 == 0 && sayi % 5 == 0)
            System.out.println(sayi + " sayisi super sayidir, yani hem 3'e hemde 5'e bolunebilir");

        else if (sayi % 5 == 0)
            System.out.println(sayi + " sayisi 5'in katidir");

        else if (sayi % 3 == 0)
            System.out.println(sayi + " sayisi 3'un katidir");

        else
            System.out.println(sayi + " sayisi yaramaz sayidir");

        scanner.close();

    }
}
