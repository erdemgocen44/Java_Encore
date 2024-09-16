package oop1.C15_forLoop;

import java.util.Scanner;

public class C15_forLoop_Stringi_Ters_Cevir {
    public static void main(String[] args) {

        // Kullanicidan bir metin isteyin ve metnin tersten yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen tersten yazdirmak istediginiz metni yaziniz :");

        String str = scanner.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        // terse cevrilmis halini kaydedelim.
        String tersStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            tersStr += str.charAt(i);
        }
    }
}
