package oop1.C15_forLoop;

public class C15_forLoop_Sayilari_Topla {
public static void main(String[] args) {
    /* Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.
     * Orn : 6543 ==> 1+6+5+4+3 = 16
     */

    Scanner scanner = new Scanner(System.in);

    System.out.println("Lutfen pozitif bir sayi giriniz: ");

    int sayi = scanner.nextInt();

    int toplam=0;

    for(int i =1; i<=sayi; i++) {

        toplam += i;
}
System.out.println("Verdiginiz sayinin rakamlari toplami : "+ toplam);
}
