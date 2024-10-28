package day25_encapsulation_inheritance;

public class C09_Toyota extends C08_Araba {

    // Dunyada toyota olarak adlandirilip,
    // modeli olmayan bir arac yok
    // O zaman bu Toyota Class'i kendisinden obje olusturmak icin degil
    // alt class'lari bir cati altinda toplamak icin olusturulmustur


    // 1- bu class baslangic itibariyle parent'i olan
    //    C08_Araba class'indaki tum ozelliklere sahiptir diyebiliriz
    //    ornegin bu class'da marka, kasa veya motor variable'lari olmasa da
    //    parent class'daki var olan variable'lari kullanabiliriz

    C09_Toyota(){
        // System.out.println(marka);
        // System.out.println(kasa);
        // motor = "1.4 benzinli";
    }

    // 2- Toyota class'i isterse parent class'i olan Araba class'indaki
    //    bazi variable'lari kendisine uyarlayabilir

    String marka = "Toyota";
    String motor = "Cevreye duyarli motor";

    // 3- Toyota class'i isterse parent class'da olmayan
    //    yeni ozellikler ekleyebilir

    String lastik = "Pirelli";
    String guvenlik = "DGS1001";
    String fren = "ABS";

    // bu durumda toyota class'indan olusturulacak obje olsa
    // Araba class'indan 3 adet ( model, sanzuman, kasa)
    // guncelledigi 2 adet (marka, motor)
    // ve yeni ekledigi 3 adet (lastik, guvenlik, fren)
    // toplam 8 ozellige sahip olur


}
