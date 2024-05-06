package oop1.C14_String_Manupulations;

public class C14_Char_At {

    public static void main(String[] args) {
        String str = "Java Canandir";

        System.out.println(str.charAt(0)); // Java

        System.out.println(str.charAt(6));

        // metnin uzunluğu

        System.out.println(str.length());

        // son harfi yazdiralim

        System.out.println(str.charAt(13 - 1));

        System.out.println(str.charAt(20));

        // Eğer metnin uzunluğundan daha buyuk bir siradaki kkarakteri istersek
        // StringIndexOutOfBoundsException hatasi verir
        // yani sınırlarimin disinda der
    }
}
