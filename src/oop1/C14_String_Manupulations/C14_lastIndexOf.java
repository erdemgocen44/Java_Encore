package oop1.C14_String_Manupulations;

public class C14_lastIndexOf {
    public static void main(String[] args) {
        String str = "Javayi ogrenecegiz, baska yolu yok";

        // a harfinin ilk kullanim indexini yazdiralim
        System.out.println(str.indexOf("a"));

        // a harfinin son kullanim indexini yazdiralim
        System.out.println(str.lastIndexOf("a"));

        System.out.println(str.indexOf("J"));// 0
        System.out.println(str.lastIndexOf("J"));// 0

        // metne bakmadan e harfinin 2 kere veya daha fazla kullanilip
        // kullanilmadigini yzdirin

        int ilkIndex = str.indexOf("e");
        int sonIndex = str.lastIndexOf("e");

        // -1 ise hiç e kullanilmamis
        if (ilkIndex == -1)
            System.out.println("Hic e kullanilmamis");
        else if (ilkIndex == sonIndex)
            System.out.println("Sadece 1 e kullanilmis");
        else
            System.out.println("Birden fazla e kullanilmis");

            
    }
}
