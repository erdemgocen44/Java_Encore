package oop1;

import java.util.Scanner;

public class C17_If_Else_Statement {
    public static void main(String[] args) {
        /*
         * Ogrencinin notu 85 ve ustu ise AA,
         * (85 ve ustu değilse) 65 ve ustu ise BB,
         * (65 ve ustu değilse) 50 ve ustu ise CC,
         * Aksi takdirde DD
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen notunuzu sayı olarak giriniz: ");

        int girilenNot=scanner.nextInt();

        if(girilenNot>=85)System.out.println("Çok iyi notunuz AA'dir");
        else if(girilenNot>=65 &&girilenNot<=84)System.out.println("Tebrikler ,notunuz BB'dir");
        
}
