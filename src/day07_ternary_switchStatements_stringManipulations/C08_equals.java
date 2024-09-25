package day07_ternary_switchStatements_stringManipulations;

public class C08_equals {

    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "ALI";
        String str3 = "ali";
        String str4 = "Ali ";
        String str5 = "Ali";

        System.out.println(str1.equals(str2)); // Ali <==> ALI ==> false
        System.out.println(str1.equals(str3)); // Ali <==> ali ==> false
        System.out.println(str1.equals(str4)); // Ali <==> Ali  ==> false
        System.out.println(str1.equals(str5)); // Ali <==> Ali ==> true
        System.out.println(str2.equals(str3)); // ALI <==> ali ==> false
        // Yazim farkliligi veya farkli karkter olursa sonuc false olur


        // EGER sadece buyuk kucuk harf farkliliklarini gozardi etmek istersek
        System.out.println("===================");
        System.out.println(str1.equalsIgnoreCase(str2)); // Ali <==> ALI ==> true
        System.out.println(str1.equalsIgnoreCase(str3)); // Ali <==> ali ==> true
        System.out.println(str1.equalsIgnoreCase(str4)); // Ali <==> Ali  ==> false FARKLI KARAKTER VAR
        System.out.println(str1.equalsIgnoreCase(str5)); // Ali <==> Ali ==> true
        System.out.println(str2.equalsIgnoreCase(str3)); // ALI <==> ali ==> true



    }
}
