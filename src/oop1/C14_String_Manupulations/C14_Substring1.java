package oop1.C14_String_Manupulations;

public class C14_Substring1 {
    public static void main(String[] args) {

        String str = "Java Canandir";

        /*
         * bize verilen stringin bir parçasini kullanabiliriz
         * 2 turlu kullanimi vardir
         * 1-baslangic indexini verirseniz o noktadan sona kadar
         * olan parcayi verir.
         */
        System.out.println(str.substring(3));

        System.out.println(str.substring(7));

        /*
         * baslangic ve bitis indexini verirseniz
         * bitis indexi haric
         * aradaki karakterleri yazdirir
         */

        System.out.println(str.substring(0, 4));

    }
}
