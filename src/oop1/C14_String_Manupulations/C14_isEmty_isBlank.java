package oop1.C14_String_Manupulations;

public class C14_isEmty_isBlank {
    public static void main(String[] args) {

        String str1 = "";
        String str2 = " ";
        String str3 = ".";

        System.out.println(str1.isEmpty());// true
        System.out.println(str2.isEmpty());// false
        System.out.println(str3.isEmpty());// false

        System.out.println(str1.isBlank());// true----bu spaceden mi olusuyor demek ama bosluk varsa yine true doner

        System.out.println(str2.isEmpty());// true

        System.out.println(str3.isBlank());// false verir cunku nokta var. bir cok bosluk olsa sadece
                                           // bir karakter varsa bile false doner

    }
}
