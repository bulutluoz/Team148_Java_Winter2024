package day35_maps_nestedMaps;

import day34_maps.MapDepo;

import java.util.Set;

public class C01_SinifGuncelleme extends MapDepo {

    public static void main(String[] args) {

        // Yil sonu sinif artirma yapin
        // her ogrenciyi bir ust sinifa gecirin
        // sinif 12 ise "mezun" yapin, zaten mezun olanlara dokunmayin

        System.out.println(ogrenciMap);

        MapDepo.yilSonuSinifArtir();
        System.out.println(ogrenciMap);

        MapDepo.yilSonuSinifArtir();
        System.out.println(ogrenciMap);

    }
}
