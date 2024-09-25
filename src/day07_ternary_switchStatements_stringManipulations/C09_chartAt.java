package day07_ternary_switchStatements_stringManipulations;

public class C09_chartAt {

    public static void main(String[] args) {

        String str = "Java Candir";


        System.out.println(str.charAt(2)); // v

        /*
            Java'da karakter sayisi ve index farklidir

            kac karakter oldugunu kontrol ederken 1'den basliyoruz
            ama index icin 0'dan basliyoruz

            bir string'de son index (karakter sayisi - 1) dir
         */

        // bastan 6. karakteri yazdirin
        System.out.println(str.charAt(5)); // C

        // son karakteri yazdirin
        System.out.println(str.charAt(10)); // r

        // Olmayan bir index kullanilirsa
        System.out.println(str.charAt(13)); // StringIndexOutOfBoundsException

    }
}
