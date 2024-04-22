package oop1;

public class C09_WrapperClasses {
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

Scanner

        String sayi5 = "23";

        String sayi6 = "45";

        int toplam = Integer.parseInt(sayi5) + Integer.parseInt(sayi6);

        System.out.println(toplam);

    }
}
