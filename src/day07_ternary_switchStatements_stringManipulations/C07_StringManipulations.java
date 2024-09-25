package day07_ternary_switchStatements_stringManipulations;

import java.util.Locale;

public class C07_StringManipulations {

    public static void main(String[] args) {

        String str = "Java Candir";

        // buyuk harfe cevirme

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str); // Java Candir

        // kucuk harfe cevirme

        System.out.println(str.toLowerCase()); // java candir

        System.out.println(str); // Java Candir


        // str'i kucuk harfe cevirip, o haliyle kaydedin

        // Bir String'in degerini kalici olarak degistirmek istiyorsak
        // ATAMA yapmaliyiz

        str = str.toLowerCase();

        System.out.println(str);


        // kalici olarak buyuk harfe cevirin

        str = str.toUpperCase();

        System.out.println(str); // JAVA CANDIR


        System.out.println(str.toLowerCase()); // java candir

        System.out.println( str.toLowerCase(Locale.CHINA)    ); // java candir

        System.out.println( str.toLowerCase(Locale.forLanguageTag("Tr"))    ); // java candır

        str = str.toLowerCase(Locale.forLanguageTag("Tr"));

        System.out.println("Turkce kucuk harf ile : " + str);
        // Turkce kucuk harf ile : java candır

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        str = str.toUpperCase(); // JAVA CANDIR

        System.out.println(str.toLowerCase()); // java candir

    }
}
