package oop1.C10_Logical;

public class C10_Logical_Mantiksal_Operatorler {
    public static void main(String[] args) {
        // && (ve) mantıksal operatoru mukemmelliyetçidir ilk rastladığı falde sonucu
        // yapıştırır
        // & mantıksal operatoru ise işlemin sonuna gider ve sonunda karar verir
        // || (veya) mantıksal operatoru ise olsada olur olmasada der
        int a = 10;
        int b = 15;
        System.out.println(a > b && b > 0);// false yazar

        System.out.println(a <= b - 5 && a > b - 8);// true yazar

        boolean c;

        System.out.println(c = 15 >= b && a < 0);// false yazar

        c = a >= b && 3 * a < 4 * b;
        System.out.println(c);// false yazıyor

        System.out.println(3 < 5 || 6 > 7);// true yazar

    }
}
