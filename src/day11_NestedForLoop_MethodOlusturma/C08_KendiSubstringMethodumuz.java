package day11_NestedForLoop_MethodOlusturma;

public class C08_KendiSubstringMethodumuz {

    public static void main(String[] args) {

        String str = "Java Candir";

        int basIndex = 2;
        int bitIndex = 6;

        /*
            Kullanicidan alinan bir metinden
            kullanicinin girdigi baslangic ve bitis indexleri arasindaki kismi yazdirin

            Kurallar :
            1- eger baslangic veya bitis index'i metnin sinirlari disinda ise hata verin
            2- baslangic index'i bitis index'inden buyukse hata mesaji verin
            3- baslangic indexindeki karakter dahil, bitis indexindeki karakter haric olmalidir

         */


        if (basIndex>str.length() || bitIndex>str.length()){
            System.out.println("Verilen index'ler metnin sinirlari disindadir");
        } else if (basIndex>bitIndex) {
            System.out.println("Baslangic index'i bitis index'inden buyuk olamaz");
        }else {

            for (int i = basIndex; i <bitIndex ; i++) {
                System.out.print(str.charAt(i));
            }
        }


        System.out.println(str.substring(basIndex, bitIndex));


        str = "Ali can";

        System.out.println(str.replace("A", "a")); // ali can

        str.substring(2); // calisir - ne goruruz - ne de sonradan kullanabiliriz
        System.out.println(str.substring(4)); // goruruz - sonradan kullanamayiz
        String sonuc = str.substring(5); // goremeyiz - sonradan kullanabiliriz

        /*
            Bize bir sonuc getiren method'lar da
            o sonuc ile ilgili biz de bir islem yapmaliyiz
            43.satirdaki method CALISIR, bize "i can" dondurur
            ama biz yazdirmadigimiz veya kaydetmedigimiz icin "i Can" havaya gider

            44.satirdaki method CALISIR ve bize "can" getirir
            yazdirma islemi yapildigi icin konsolda "can" yazisini goruruz
            ama dondurulen "can" yazisini sonraki satirlarda yeniden kod yazmadan kullanamayiz

            45.satirdaki method CALISIR ve bize "an" getirir
            yazdirma islemi yapilmadigi icin konsolda "an" yazisini GOREMEYIZ
            amma bir variable'a kaydettigimiz icin
            45.satirdan sonra ne zaman "an" degerine ihtiyacimiz olsa sonuc variable'ini kullanabiliriz
         */



    }
}
