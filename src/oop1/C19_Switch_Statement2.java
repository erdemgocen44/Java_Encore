package oop1;

public class C19_Switch_Statement2 {
    public static void main(String[] args) {
        /*
         * Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek
         * istedigini alin ve girilen harfin karsiligini yazdirin
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen ISTQB harflerinden birini seciniz: ");
        char harf = scanner.next().charAt(0);
    }
}
