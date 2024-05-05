package oop1.C02_Scanner;
import java.util.Scanner;

public class C02_Scanner2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Adinizi Giriniz: ");
        String ad = scanner.nextLine();

        System.out.print("Lütfen Soyadinizi Giriniz: ");
        String soyad = scanner.nextLine();

        System.out.print("Lütfen Yasinizi Giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Verdiginiz bilgilere göre; "
                + "\nIsminiz: " + ad
                + "\nSoyisminiz: " + soyad
                + "\nYasiniz: " + yas
                + "\nKaydiniz basariyla tamamlanmistir...");
        scanner.close();
    }
}
