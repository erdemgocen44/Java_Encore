package oop1.C03_Data_Casting;

public class C03_DataCasting2 {
    public static void main(String[] args) {

        int sayi1 = 45;

        int sayi2 = sayi1;

        double dbd = sayi1; // int to double casting genişletme

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
        System.out.println("double = " + dbd);

        short sayi3 = 22;

        sayi1 = sayi3; // upcasting - yükseltme genişletme auto widening

        System.out.println("sayi1 = " + sayi1);

        int sayi4 = 11;

        byte byt = (byte) sayi4;// downcasting-küçültme

        System.out.println("byt = " + byt);

        double dbl2 = 34.55;

        int sayi5 = (int) dbl2;

        System.out.println("sayi5 = " + sayi5);
    }
}
