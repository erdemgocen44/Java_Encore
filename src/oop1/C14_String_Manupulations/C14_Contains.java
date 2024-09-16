package oop1.C14_String_Manupulations;

public class C14_Contains {
    public static void main(String[] args) {
        String str = "Java zamanla guzellesiyor";

        System.out.println(str.contains("Java"));// true
        System.out.println(str.contains("java"));// false
        System.out.println(str.contains("zaman"));// true
        System.out.println(str.contains("zamn"));// false
        System.out.println(str.contains("a z"));// true
        System.out.println(str.contains("a g"));// true

        /*
         * contains methodu aranan metnin sayisiyla ilgilenmez
         * sadece var mı yok mu yani true yada false verir
         */

    }
}
