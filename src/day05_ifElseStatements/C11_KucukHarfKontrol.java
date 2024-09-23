package day05_ifElseStatements;

import java.util.Scanner;

public class C11_KucukHarfKontrol {

    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa(kucuk harf degilse) girilen karakteri girildigi gibi yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");
        char karakter= scanner.next().charAt(0);


        // 1.yontem ascii table

        if (karakter >='a' && karakter<='z'){
            System.out.println("Girilen kucuk harfi buyuk harfe cevirdim : " +  (char)(karakter-32)  );
        } else System.out.println("Girilen karakter : " + karakter);


        // 2.yontem wrapper class

        if ( Character.isLowerCase(karakter)){
            System.out.println(Character.toUpperCase(karakter));
        }else System.out.println(karakter);


    }
}
