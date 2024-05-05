package oop1.C14_String_Manupulations;

import java.util.Locale;

public class C14_String_Manupulation1 {
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
