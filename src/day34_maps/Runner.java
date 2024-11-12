package day34_maps;

public class Runner {

    public static void main(String[] args) {

        MapDepo.isimdenListeYazdir("Ali");
        //Ismi Ali olan ogrenci listesi
        //Ali Can 11 H
        //Ali Cem 11 K

        MapDepo.isimdenListeYazdir("veli");
        //Ismi veli olan ogrenci listesi
        //Veli Cem 10 K

        MapDepo.sinifSubeListesiYazdir(10,"k");
        //10/k sinifi ogrenci listesi
        //Veli Cem
        //Sevgi Can

        MapDepo.sinifSubeListesiYazdir(11,"M");
        //11/M sinifi ogrenci listesi
        //Sevgi Cem
        //Esra Han




    }
}
