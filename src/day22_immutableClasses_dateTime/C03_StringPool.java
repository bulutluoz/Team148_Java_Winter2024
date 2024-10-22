package day22_immutableClasses_dateTime;

public class C03_StringPool {

    public static void main(String[] args) {

        String str1 = "Ali"; // 1
        String str2 = "Ali"; // 1
        String str3 = new String("Ali"); // 2
        String str4 = "A" + "li"; // 1
        String s = "A"; // 1
        String t = "li"; // 1
        String str5 = s + t ; // 2
        String r = "ali"; // 1
        String str6 = r.substring(0,1).toUpperCase()+ r.substring(1); // 2


        /*
            Java'da temel olarak 2 turlu String olusturabiliriz
            1- en basit yontem olan " " icinde yazarak veya " " lari + ile birlestirerek
            2- new keyword veya method'lar kullanilarak

            Java obje olusturmada tasarruf etmek icin
            1.yontemle olusturulan String'leri ayri bir String Pool'da tutar

            EGERRRR 1.yontemle bir String olusturdugumuzda
                    String pool'da daha once ayni degere sahip bir String varsa
                    Java yeni String'i eski String ile eslestirir
                    ayni referans ve ayni degeri kullanmalarini saglar
         */


        System.out.println(str1.equals(str2)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str3)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str4)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str5)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str6)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals("Ali")); // Ali <==> Ali  ==> true

        System.out.println("======================");

        /*
            String ifadelerin esitligini kontrol etmek icin == kullanirsak
            metni ayni olan ifadeler icin her zaman true vermez

            == Sadece metne bakmaz, metne ve referansa birlikte bakar
               yani true olmasi icin hem metnin, hem de referansin ayni olmasi gerekir
               bu da ancak String Pool'da olup metni ayni olan String'ler icin MUMKUNDUR

            equals() ise SADECE metne bakar, metin ayni ise true verir
         */


        System.out.println(str1 == str2); // Ali h<==>h Ali  ==> true
        System.out.println(str1 == str3); // Ali h<==>- Ali  ==> false
        System.out.println(str1 == str4); // Ali h<==>h Ali  ==> true
        System.out.println(str1 == str5); // Ali h<==>- Ali  ==> false
        System.out.println(str1 == str6); // Ali h<==>- Ali  ==> false
        System.out.println(str1 == "Ali"); // Ali h<==>h Ali  ==> true
        System.out.println(str2 == "Ali"); // Ali h<==>h Ali  ==> true
        System.out.println(str3 == str4); // Ali -<==>h Ali  ==> false
        System.out.println(str5 == str6); // Ali -<==>- Ali  ==> false
        System.out.println(str6 == str2); // Ali -<==>h Ali  ==> false





    }
}
