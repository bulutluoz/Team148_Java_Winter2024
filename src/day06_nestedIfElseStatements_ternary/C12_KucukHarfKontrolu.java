package day06_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C12_KucukHarfKontrolu {

    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen karakteri girildigi gibi yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz...");

        char karakter = scanner.next().charAt(0);


        System.out.println( Character.isLowerCase(karakter) ? Character.toUpperCase(karakter) : karakter );



    }
}
