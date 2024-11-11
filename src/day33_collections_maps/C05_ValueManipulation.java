package day33_collections_maps;

import java.util.Arrays;

public class C05_ValueManipulation {

    public static void main(String[] args) {

        // Biz ogrenci map'i olustururken, her ogrencinin
        // isim-soyisim-sinif-sube-bolum bilgilerini value olarak tutuyoruz
        // asagida verilen value'deki isim ve soyismi yazdirin

        String value = "Ali can-Tataroglu-10-K-Say";

        // value bir String oldugu icin,
        // String icindeki degerleri manipule etmemiz gerekir
        // value olusturulurken degerler arasina - konulmussa
        // biz de tersine islem yapip split ile -'den bilgileri ayirt edebiliriz

        String[] bilgiler = value.split("-");

        System.out.println(Arrays.toString(bilgiler));

        // [Ali can, Tataroglu, 10, K, Say]

        // Array'den istedigimiz bilgiye rahatlikla ulasabiliriz

        System.out.println( bilgiler[0] + " " + bilgiler[1]); // Ali can Tataroglu



        value = "Veli-Cem-11-K-TM";


        // kullanicidan gecmek istedigi bolumu secim
        // value'deki bolum degerini update edin

        String istenenYeniBolum = "MF";

        // EGER value bir String olarak olusturulmussa
        // bilgileri kullanabilmek icin once split yapmaliyiz
        bilgiler = value.split("-");
        //[Veli, Cem, 11, K, TM]

        // array haline gelince istedigimiz bilgiyi yazdirabilir veya update edebiliriz
        bilgiler[4] = istenenYeniBolum;
        //[Veli, Cem, 11, K, MF]

        // guncellemeyi bilgiler array'inde yaptik
        // guncel bilgileri tekrar birlestirip value olarak kaydetmemiz gerekir
        value = bilgiler[0]+ "-"+
                bilgiler[1]+ "-"+
                bilgiler[2]+ "-"+
                bilgiler[3]+ "-"+
                bilgiler[4];

        value = String.join("-",bilgiler);

        System.out.println("Value'nun son hali : " + value);











    }
}
