package day19_constructors;

public class C05_Araba {


    String marka = "marka atanmamis";
    String model = "model atanmamis";
    String renk = "Renk atanmamis";
    int yil = 1900;
    int fiyat ;

    C05_Araba(){
        // bir Kod blogunun constructor olmasi icin
        // MUTLAKA 2 sarti karsilamasi gerekir
        // 1- ismi class ismi ile ayni olmalidir (buyuk harfle baslar)
        // 2- return type olmaz
    }


    void method1(){
       // return type varsa method'dur
    }

    void C05_Araba(){
        // ismi class ismi ile ayni
        // AMMAA return type oldugu icin method'dur
    }

    //C005_Araba(){
        // ismi class ismi ile ayni degil, Constructor olamaz
        // return type yok, method olamaz
        // CTE verir , CALISMAZ
    //}

}
