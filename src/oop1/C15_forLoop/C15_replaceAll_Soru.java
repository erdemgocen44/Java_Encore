package oop1.C15_forLoop;

import java.util.Scanner;

public class C15_replaceAll_Soru {
    public static void main(String[] args) {
        /*
         * kullanicidan bir metin isteyin
         * metnin icindeki tum sayilari ve space disindaki
         * ozel karakterleri temizleyin
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir metin giriniz: ");

        String girilenMetin = scanner.nextLine();
        // once sayilardan kurtulalim
        girilenMetin = girilenMetin.replaceAll("\\d", "");
        /*
         * once sayilardan kurtulduktan sonra space yerine herhangi bir sayi atayalim
         * ozel karakterlerden kurtulmak istedigimizde
         * space de kaybolur
         * bunun icin once space i korumaya almaliyiz
         * zaten replaceAll ın mantigi BUTUNNN olanlari yoket demektir
         */

        // ozel karakterlerden kurtulalim
        girilenMetin = girilenMetin.replaceAll("\\d", "");

        // simdi space yerine 1 ekleyelim
        girilenMetin = girilenMetin.replaceAll("\\s", "1");

        // simdi 1 lerden kurtulalim
        girilenMetin = girilenMetin.replaceAll("1", " ");

        System.out.println("Metninizin yeni hali su sekildedir: " + girilenMetin);

        scanner.close();
    }
}
