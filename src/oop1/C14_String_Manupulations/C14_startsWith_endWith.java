package oop1.C14_String_Manupulations;

public class C14_startsWith_endWith {

    public static void main(String[] args) {
        String str = "Java cok ama cok guzel";

        System.out.println(str.startsWith("J"));// true
        System.out.println(str.startsWith("j"));// false
        System.out.println(str.endsWith("el"));// true
        System.out.println(str.startsWith("Java"));// true
        System.out.println(str.startsWith(""));// true

        // 5.indexten sonra c ile mi baslar

        System.out.println(str.startsWith("c", 5));// true

        System.out.println(str.startsWith("ok", 6));// true

        // str el mi biter

        System.out.println(str.endsWith("el"));// true

    }
}
