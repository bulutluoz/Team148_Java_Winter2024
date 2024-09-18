package day03_dataCasting_WrapperClasses;

public class C07_FaydaliWrapperClassMethodlari {

    public static void main(String[] args) {

       String fiyat1 = "21.28";
       String fiyat2 = "15.46";

       // belirli formatta verilen iki fiyatin toplamini yazdirin

        System.out.println(fiyat1 + fiyat2); // 21.2815.46

        double fyt1 = Double.parseDouble(fiyat1);
        double fyt2 = Double.parseDouble(fiyat2);

        System.out.println("Fiyatlarin toplami : " +  (fyt1+fyt2)); // Fiyatlarin toplami : 36.74


        fiyat1 = "45";
        fiyat2 = "48";

        // fiyat1 fiyat2'den kucuk ise true, kucuk degilse false yazdirin

        // System.out.println( fiyat1 < fiyat2 ); // Operator '<' cannot be applied to 'String', 'String'

        int fy1 = Integer.parseInt(fiyat1);
        int fy2 = Integer.valueOf(fiyat2);

        System.out.println( fy1 < fy2 ); // true


        // int bir sayinin maximum kac olabilecegini yazdirin

        System.out.println( Integer.MAX_VALUE); // 2147483647

        // short bir sayinin min kac degerini alabilecegini yazdirin

        System.out.println( Short.MIN_VALUE); // -32768


        // Character class'inda kullanabilecegimiz bazi ozellikler

        char ch1 = 'a';
        char ch2 = 'K';

        // ch1'i buyuk harf olarak yazdirin

        System.out.println(Character.toUpperCase(ch1)); // A

        // ch2'yi kucuk harf olarak yazdirin

        System.out.println(Character.toLowerCase(ch2)); // k

        // ch1 sayi mi ?

        System.out.println(Character.isDigit(ch1)); // false

        // ch2 buyuk harf mi ?

        System.out.println(Character.isUpperCase(ch2)); // true

        // ch2 harf mi ?
        System.out.println(Character.isLetter(ch2)); // true

        // ch2 alfabetik mi ?
        System.out.println(Character.isAlphabetic(ch2)); // true



    }
}
