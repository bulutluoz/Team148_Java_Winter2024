package day34_maps;

import java.util.Map;

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

        MapDepo.soyisimdenListeYazdir("can");
        //Soyismi can olan ogrenci listesi
        //Ali 11 H
        //Ayse 10 H
        //Sevgi 10 K

        MapDepo.bolumListesiYazdir("MF");
        //MF Bolumundeki ogrenci listesi
        //101 Ali Can H
        //104 Ayse Can H
        //106 Sevgi Can K

        MapDepo.numaraAraligindakiOgrenciListesi(104,106);
        //104 ile 106 numaralari arasindaki ogrenci listesi
        //104 Ayse Can
        //105 Sevgi Cem
        //106 Sevgi Can




    }
}
