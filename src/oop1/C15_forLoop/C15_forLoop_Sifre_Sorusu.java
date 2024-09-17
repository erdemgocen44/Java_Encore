package oop1.C15_forLoop;

import java.util.Scanner;

public class C15_forLoop_Sifre_Sorusu {
    public static void main(String[] args) {
        /*
         * Soru 4: Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
         * ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
         * eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
         * - ilk harf kucuk harf olmali
         * - son karakter rakam olmali
         * - sifre bosluk icermemeli
         * - uzunlugu en az 10 karakter olmali
         * flag yontemini kullanalim
         * flag basta true olsun ve her uygun olmayan
         * durumda false degeri atayalim
         */

        // Başlangıçta tüm şartların sağlandığını varsayarak flag'i true olarak
        // başlatıyoruz
        boolean flag = true;

        // Kullanıcıdan şifre almak için Scanner nesnesi oluşturuluyor
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan şifresini girmesini istiyoruz
        System.out.println("Lutfen sifrenizi giriniz: ");

        // Kullanıcının girdiği şifreyi bir String değişkenine atıyoruz
        String sifre = scanner.nextLine();

        // Şifrenin ilk karakterini alıyoruz
        char ilkHarf = sifre.charAt(0);

        // İlk harfin küçük harf olup olmadığını kontrol ediyoruz
        if (!(ilkHarf >= 'a' && ilkHarf <= 'z')) {
            // Eğer küçük harf değilse kullanıcıya uyarı veriyoruz ve flag'i false yapıyoruz
            System.out.println("Ilk harf kucuk harf olmali");
            flag = false;
        }

        // Şifrenin son karakterini alıyoruz
        char sonKarakter = sifre.charAt(sifre.length() - 1);

        // Son karakterin bir rakam olup olmadığını kontrol ediyoruz
        if (!(sonKarakter >= '0' && sonKarakter <= '9')) {
            // Eğer rakam değilse kullanıcıya uyarı veriyoruz ve flag'i false yapıyoruz
            System.out.println("Son karakter rakam olmali");
            flag = false;
        }

        // Şifrede boşluk karakteri olup olmadığını kontrol ediyoruz
        if (sifre.contains(" ")) {
            // Eğer şifre boşluk içeriyorsa kullanıcıya uyarı veriyoruz ve flag'i false
            // yapıyoruz
            System.out.println("Sifre bosluk icermemeli");
            flag = false;
        }

        // Şifrenin uzunluğunun en az 10 karakter olup olmadığını kontrol ediyoruz
        if (!(sifre.length() >= 10)) {
            // Eğer şifre 10 karakterden kısa ise kullanıcıya uyarı veriyoruz ve flag'i
            // false yapıyoruz
            System.out.println("Sifre en az 10 karakter olmali");
            flag = false;
        }

        // Eğer flag hala true ise, tüm şartlar sağlanmış demektir
        if (flag) {
            // Şifre başarılı şekilde kaydedildi mesajı veriyoruz
            System.out.println("Sifreniz basarili sekilde kaydedildi: " + sifre);
        }

        // Scanner nesnesini kapatarak kaynakları serbest bırakıyoruz
        scanner.close();
    }
}
