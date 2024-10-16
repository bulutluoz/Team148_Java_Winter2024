package day19_constructors;


public class C02_Hastane {

    /*
        C02_Hastane(){

            }
        default constructor parametresizdir
        ve body'sinde kod yoktur

        gorunur bir constructor olusturuldugunda
        java default constructor'i siler
     */



    String perIsim = "isim atanmamis";
    String perAdres = "adres atanmamis";
    String perTel = "tel atanmamis";


    C02_Hastane(){
        System.out.println("Parametresiz cons. calisti");
    }

    // Bu default constructor degildir
    // Bu parametresiz constructor'dir

}
