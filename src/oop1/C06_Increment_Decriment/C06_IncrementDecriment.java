package oop1.C06_Increment_Decriment;

public class C06_IncrementDecriment {
    public static void main(String[] args) {
        int sayi = 24;

        // sayinin değerini artıralım

        sayi = sayi + 5;

        System.out.println(sayi);

        sayi += 5;

        System.out.println(sayi);

        sayi++;

        System.out.println(sayi);

        double dbl = 3.5;

        dbl = dbl * 3;

        System.out.println(dbl);

        dbl *= 3;

        System.out.println("Yeni deger dbl= " + dbl);

        sayi = 10;

        // sayının değerini yazdırın sonra sayının değerini 1 artırın

        System.out.println(sayi++);
        System.out.println("1 artirtik hali: " + sayi);

        sayi = 10;

        // sayının değerini 1 artirin sonra yazdırın

        System.out.println(++sayi);

        sayi = 10;

        // once sayinin degerini olusturacaginiz b variable'na atayin
        // sonra sayinin degerini 1 artırın

        int b = sayi;
        sayi++;

        System.out.println("b'nin degeri: " + b + ", sayinin degeri: " + sayi);

        sayi = 10;

        sayi++;

        b = sayi;

        System.out.println("yeni b'nin degeri: " + b + ", yeni sayinin degeri: " + sayi);

    }
}
