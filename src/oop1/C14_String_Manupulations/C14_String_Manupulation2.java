package oop1.C14_String_Manupulations;

public class C14_String_Manupulation2 {
    public static void main(String[] args) {
        String str = "Java Canandir";

        System.out.println(str.charAt(0));

        System.out.println(str.charAt(6));

        System.out.println(str.length());

        System.out.println(str.length() - 3);

        System.out.println(str.charAt(13 - 3));

        System.out.println(str.toUpperCase().charAt(13 - 3));
        
        System.out.println(str.concat("a"));

    }
}
