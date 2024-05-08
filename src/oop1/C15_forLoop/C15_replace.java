package oop1.C15_forLoop;

public class C15_replace {
    public static void main(String[] args) {
        String str = "Fransizcayi anliyorum ama iyi konusamiyorum";

        System.out.println(str);// şimdi tum i yerine e yazalim degistirelim
        System.out.println(str.replace("i", "e"));// Fransezcaye anleyorum ama eye konusameyorum

        // Sayilarin tamamindan kurtulmak istersek
        // replace() yeterli olmaz
        // java da sayilar, ozel karakterler, alfabetik karakterlerin // tumuyle islem
        // yapmak isterseniz
        // replaceAll(istenenGrup, yeniDeger)
        // ornegin butun sayilarin yerine "" atamak icin

        String str2 = "1Ja4va 8C9a5n7d11ir125";

        System.out.println(str2);

        str = str2.replaceAll("\\d", "");

        System.out.println(str);

    }
}
