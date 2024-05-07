package oop1.C14_String_Manupulations;

public class C14_nullPointer {
    public static void main(String[] args) {
        String str1;

        /*
         * null bir deger degil, pointer dır
         * yani isaretleyici
         * str2'nin degeri null veya str2ye null degeri atanmis
         * ifadeleri yanlistir. dogru olan ifade
         * str2 null olarak ISARETLENMISTIR
         * Ça ve dire : str2ye deger atamadik
         * null olarak isaretledik
         * deger atamayinca ne yazdirabiliriz nede baska islem yapabiliriz
         */

        String str2 = null;

        System.out.println(str2);
        System.out.println(str2 + " candir");// null candir
        System.out.println(str2.concat(" candir"));//Null pointer Exception

    }
}
