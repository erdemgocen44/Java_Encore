package oop1;

import java.util.Locale;

public class C20_String_Manupulation1 {
    public static void main(String[] args) {

        String str = "Java Candir";

        // ilk harf icin

        System.out.println(str.charAt(0));

        // harfleri buyutelim

        System.out.println(str.toUpperCase());

        // harfleri kucultelim

        System.out.println(str.toLowerCase());

        System.out.println(str);// atama yapmadigimiz surece stringde yaptigimiz degisikler kalici olmaz

        str = str.toLowerCase();
        System.out.println(str);

        System.out.println(str.toUpperCase(Locale.FRANCE));

    }
}
