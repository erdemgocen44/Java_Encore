package oop1.C14_String_Manupulations;

public class C14_IndexOf {
    public static void main(String[] args) {
        String str = "Ali topu at, topu at ali";

        System.out.println(str.indexOf("top"));// 4

        // peki 2. top metin parcaciginin indexini yazdiralim

        System.out.println(str.indexOf("top", 4));// 4

        System.out.println(str.indexOf("top", 5));// 13 yazar. ilk top indexini atlayıp bir rakam fazla yazmaliyiz

        System.out.println(str.indexOf("top", str.indexOf("top") + 1));// burada da 13 yazar.

        // at kelimesinin 2 kere kullanilip kullanilmadigini metne bakmadan bulalim

        System.out.println(str.indexOf("at"));// bir kere kullanilmis

        int ilkIndex = str.indexOf("at");

        if (ilkIndex == -1) {// hic kullanilmamis demektir
            System.out.println("iki kere kullanilmamistir");
        } else
            System.out.println("En az bir kere kullanilmistir");

        int ikinciIndex = str.indexOf("at", ilkIndex);// -1 veya 2.defa kullanilmissa dogal sayi olur
        if (ikinciIndex == -1) {
            System.out.println("iki kere kullanilmamistir");
        } else
            System.out.println("2 defa veya daha fazla kullanilmis");

    }
}
