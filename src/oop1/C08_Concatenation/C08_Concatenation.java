package oop1.C08_Concatenation;

public class C08_Concatenation {
    public static void main(String[] args) {
        String str = "Java ";

        String str2 = "est bon";

        int count = 5;

        boolean bl = true;

        char chr = 'k';

        System.out.println(str + str2);
        System.out.println(str + count);
        System.out.println(str + bl);
        System.out.println(str + chr);

        System.out.println(str.concat(str2));

        String s1 = "Java";
        String s2 = "Candir";
        String s3 = " ";
        String s4 = "";

        int a = 4;
        int b = 6;

        System.out.println(s1 + s3 + s2 + s3 + s4 + a + b);// Java Candiır 4 6

        // Java 10

        System.out.println(s1 + s3 + (a + b));

        // 10 Java

        System.out.println((a + b) + s3 + s1);

        // 46 Java

        System.out.println(s4 + a + b + s3 + s1);

    }
}
