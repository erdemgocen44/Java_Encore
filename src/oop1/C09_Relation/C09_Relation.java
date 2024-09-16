package oop1.C09_Relation;

public class C09_Relation {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        System.out.println(a > b);
        boolean sonuc = a < b;
        System.out.println(sonuc);

        System.out.println(a == b - 10);// false yazacak

        System.out.println(sonuc = 15 == a);// false yazacak

        System.out.println(a != b); // true yazacak

        /*
         * !true==>false
         * !(5==5)==>false
         * !(5!=5)==>true
         * !(5>5)==>true
         * !(5<5)==>false
         * !(5>=5)==>false
         * !(5<=5)==>true
         * !(5!=5)==>true
         * !(5==5)==>false
         * 
         */
        System.out.println(a != b);// true yazdırır

        System.out.println(a == b); // false yazdırır

        System.out.println(a != b - 5);// false yazdırır;

        System.out.println(sonuc = 15 * a != 10 * b);

    }
}
