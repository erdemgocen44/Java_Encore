package oop1.C15_forLoop;

public class C15_forLoopDikkatEdilecekler {
    public static void main(String[] args) {
        // 1) Verdigimiz baslangic degeri bitis sartini karsilamazsa

        // for (int i = 0; i > 10; i++) {

        // System.out.println(i);// exitcode 0 hatasi ile forloop calisir ama forloop
        // hic DEVREYE GIRMEZ
        // }

        // 2) baslangic degeri ve degisim sekli
        // hicbir zaman bitis degerine ulasamazsa
        // cunku sonsuz loop olusur
        // for (int i = 0; i >= 10; i++) {

        // System.out.println(i + ", ");

        // }

        // Kullanicinin verdigibaslangic ve bitis degerleri dahil olarak
        // bu sayilarin arasinda aranan sayiya tam bolunebilen bir sayi
        // varsa "aranan sayi ile tam bolunebilen bir sayi var" yazdirin
        int baslangic = 201;
        int bitis = 237;
        int arananSayi = 43;

        for (int i = baslangic; i <= bitis; i++) {
            System.out.println(i);
            if (i % arananSayi == 0) {
                System.out.println("Aranan sayi ile tam bolunebilen bir sayi var");
                break;
            }
        }
    }
}