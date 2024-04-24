package oop1;

public class C12_PreIncrement_PostIncrement {
public static void main(String[] args) {
    
int sayi=10;

sayi++;

System.out.println(sayi); // 11

++sayi;

System.out.println(sayi); // 12

sayi--;

System.out.println(sayi); // 11

--sayi;

System.out.print("Sayinin degeri: "+sayi); // 10

sayi=10;

System.out.println(sayi++); // 10
// burada yazilan sonuc 10 olur 


System.out.println(++sayi); // 12

// sonra sayinin degeri 12 olur





}
}
