package day35_maps_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C03_NestedMap {

    public static void main(String[] args) {

        /*
            key = 101, value ==> isim=Ali, soyisim=Can, sinif=11, sube=H, bolum=MF




            ogrenciMap.put(102,"Veli-Cem-10-K-TM");
            ogrenciMap.put(103,"Ali-Cem-11-K-TM");
         */

        Map<Integer , Map<String,String> > ogrenciMap = new HashMap<>();

        Map<String,String> ogrenci103ValueMap = new HashMap<>();
        ogrenci103ValueMap.put("isim","Ali");
        ogrenci103ValueMap.put("soyisim","Cem");
        ogrenci103ValueMap.put("sinif","11");
        ogrenci103ValueMap.put("sube","K");
        ogrenci103ValueMap.put("bolum","TM");
        ogrenciMap.put(103,ogrenci103ValueMap);

        Map<String,String> ogrenci102ValueMap = new HashMap<>();
        ogrenci102ValueMap.put("isim","Veli");
        ogrenci102ValueMap.put("soyisim","Cem");
        ogrenci102ValueMap.put("sinif","10");
        ogrenci102ValueMap.put("sube","K");
        ogrenci102ValueMap.put("bolum","TM");
        ogrenciMap.put(102,ogrenci102ValueMap);

        Map<String,String> ogrenci101ValueMap = new HashMap<>();
        ogrenci101ValueMap.put("isim","Ali");
        ogrenci101ValueMap.put("soyisim","Can");
        ogrenci101ValueMap.put("sinif","11");
        ogrenci101ValueMap.put("sube","H");
        ogrenci101ValueMap.put("bolum","MF");
        ogrenciMap.put(101,ogrenci101ValueMap);

        System.out.println(ogrenciMap);
        /*
            {
                101={sinif=11, sube=H, soyisim=Can, bolum=MF, isim=Ali},
                102={sinif=10, sube=K, soyisim=Cem, bolum=TM, isim=Veli},
                103={sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali}
             }
         */

        // 101 numarali ogrencinin soyismini yazdirin
        System.out.println(ogrenciMap.get(101).get("isim")); // Ali

        // 103 numarali ogrencinin sinifini yazdirin
        System.out.println(ogrenciMap.get(103).get("sinif")); // 11

        // 102 numarali ogrencinin soyismini "Kaya" yapin
        ogrenciMap.get(102).put("soyisim","Kaya");

        // 101 numarali ogrencinin sinifini 10 yapin
        ogrenciMap.get(101).put("sinif","10");

        System.out.println(ogrenciMap);

    }
}
