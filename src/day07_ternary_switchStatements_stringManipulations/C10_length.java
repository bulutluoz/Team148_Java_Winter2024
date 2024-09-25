package day07_ternary_switchStatements_stringManipulations;

public class C10_length {

    public static void main(String[] args) {

        String str = "Java Candir";



        // eger kullanilan karakter sayisini gormek istersek

        System.out.println(str.length()); // 11


        // son karakteri yazdirin

        System.out.println(str.charAt(str.length() - 1)); // r


        // sondan 3. karakteri yazdirin

        System.out.println(str.charAt(str.length() - 3)); // d
    }
}
