package oop1.C03_Data_Casting;

public class C03_DataCasting1 {
    public static void main(String[] args) {

        boolean bl = true;

        char chr = 'a';

        byte byt = 24;

        short shrt = 243;

        int in = 3365;

        long ln = 1234567890123456789L;

        float flt = 23.6f;

        double dbl = 23.6;

        String str = "Mervem";

        System.out.println("bl = " + bl);
        System.out.println("chr = " + chr);
        System.out.println("byt = " + byt);
        System.out.println("shrt = " + shrt);
        System.out.println("in = " + in);
        System.out.println("ln = " + ln);
        System.out.println("flt = " + flt);
        System.out.println("dbl = " + dbl);
        System.out.println("str = " + str);

        // casting from primitive type to another

        // boolean ve String e sadece kendi cinsinden bir değer atanabilir

        /*
         * Java'da, tamsayılar için byte, short, int, ve long gibi veri tipleri
         * bulunmaktadır.
         * 
         * byte: 8 bit (1 byte) ve -128 ile 127 arasında değer alır.
         * short: 16 bit (2 byte) ve -32,768 ile 32,767 arasında değer alır.
         * int: 32 bit (4 byte) ve -2,147,483,648 ile 2,147,483,647 arasında değer alır.
         * long: 64 bit (8 byte) ve -9,223,372,036,854,775,808 ile
         * 9,223,372,036,854,775,807 arasında değer alır.
        
        
         * Ondalık sayılar için float ve double veri tipleri kullanılır.
         * 
         * float: 32 bit (4 byte) ve yaklaşık olarak ±3.40282347 x 10^38 arasında değer
         * alır.
         * double: 64 bit (8 byte) ve yaklaşık olarak ±1.7976931348623157 x 10^308
         * arasında değer alır.
         * Bu değer aralıkları, Java'nın farklı veri tiplerinin ne kadar bellek
         * kullanabileceğini ve hangi değer aralıklarını desteklediğini belirtir.
         */

    }
}
