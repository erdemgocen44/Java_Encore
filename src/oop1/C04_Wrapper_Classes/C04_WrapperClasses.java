package oop1.C04_Wrapper_Classes;

import java.util.Scanner;

public class C04_WrapperClasses {
    public static void main(String[] args) {
        int sayi = 10;

        String str = "Java";

        // Bazı Java Primitive data türleri için Wrapper Classları oluşturmuştur.

        Integer sayi2 = 20; // bu data turu non primitive

        // Wrapper claslar aynı isimdeki primitive data türüyle geçiş özelliğine
        // sahiptir.

        /*
         * boolen için Boolean
         * char için Character
         * byte için Byte
         * short için Short
         * int için Integer
         * long için Long
         * float için Float
         * double için Double
         * 
         */

        // Wrapper classlar sayesinde diğer data türleri içinde hazır methodlar
        // kullanabiliriz...

        Integer sayi3 = sayi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen iki sayi giriniz: ");

        String sayi5 = scanner.nextLine();

        String sayi6 = scanner.nextLine();

        int toplam = Integer.parseInt(sayi5) + Integer.parseInt(sayi6);

        System.out.println("GENEL TOPLAM = " + toplam);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);

        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        char chr = 'a';
        // bunu büyütmek için;

        System.out.println("chr=" + Character.toUpperCase(chr));
        scanner.close();
    }
}
