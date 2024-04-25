package oop1;

public class C14_Relation {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a > b);
        boolean sonuc = a < b;
        System.out.println(sonuc);

        System.out.println(a == b - 10);// true yazacak

        System.out.println(sonuc = 15 == a);

        System.out.println(a != b); // false yazacak

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

    }
}
