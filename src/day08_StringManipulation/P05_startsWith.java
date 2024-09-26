package day08_StringManipulation;

public class P05_startsWith {

    public static void main(String[] args) {
        /*
        Br string'in başka bir tring ile başlayıp başlamadığını kontrol eder
        iki kullanımı vardır;
        ilkinde baştan bakar
        ikinci kullanımda istediğiniz indexin
        istediğiniz bir string ile başlayıp başlamadığını kontrol eder
         */

        String str="Java Öğrenmek çok güzel, çok";

        System.out.println(str.startsWith("J")); // true J
        System.out.println(str.startsWith("Java ")); // true Java
        System.out.println(str.startsWith("Java Öğrenmek çok güzel, çok")); // true Java Öğrenmek çok güzel, çok


        System.out.println(str.startsWith("Öğrenmek",5)); //true

    }
}
