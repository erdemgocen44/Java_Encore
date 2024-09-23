package oop1.C16_NestedForLoop;

public class C01_NestedForLoop {
    public static void main(String[] args) {
        /*
         * Aşagidaki tabloyu konsolda yazdirin
         * 
         * 1 2 3 4
         * 2 4 6 8
         * 3 6 9 12
         */

        for (int i = 1; i <= 4; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();

        for (int i = 1; i <= 4; i++) {
            System.out.print(i * 2 + "  ");
        }
        System.out.println();

        for (int i = 1; i <= 4; i++) {
            System.out.print(i * 3 + "  ");
        }
    }
}
