package oop1.C07_Preincrement;

public class C07_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        int sayi = 10;

        sayi++;

        System.out.println(sayi); // 11

        ++sayi;

        System.out.println(sayi); // 12

        sayi--;

        System.out.println(sayi); // 11

        --sayi;

        System.out.print("Sayinin degeri: " + sayi); // 10

        sayi = 10;

        System.out.println(sayi++); // 10
        // burada yazilan sonuc 10 olur

        System.out.println(++sayi); // 12

        // sonra sayinin degeri 12 olur

        int a = 20;

        int b = --a;

        System.out.println("a: " + a + ", b: " + b); // a: 19 b: 19

    }
}
