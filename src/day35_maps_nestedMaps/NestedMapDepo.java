package day35_maps_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class NestedMapDepo {

    protected static Map<Integer , Map<String,String>> ogrenciMap = new HashMap<>();

    static {
        ogrenciyiMapeEkle(101,"Ali","Cem","11","K","TM");
        ogrenciyiMapeEkle(102,"Ipek","Can","10","M","MF");
        ogrenciyiMapeEkle(103,"Esra","Can","11","L","MF");
        ogrenciyiMapeEkle(104,"Maya","Cem","10","L","TM");
        ogrenciyiMapeEkle(105,"Hamza","Kaya","12","K","Soz");
        ogrenciyiMapeEkle(106,"Dilan","Kaya","9","M","Soz");
    }

    private static void ogrenciyiMapeEkle(int numara ,String isim, String soyisim, String sinif, String sube, String bolum) {

        Map<String,String> eklenecekValueMap = new HashMap<>();
        eklenecekValueMap.put("isim",isim);
        eklenecekValueMap.put("soyisim",soyisim);
        eklenecekValueMap.put("sinif",sinif);
        eklenecekValueMap.put("sube",sube);
        eklenecekValueMap.put("bolum",bolum);

        ogrenciMap.put(numara,eklenecekValueMap);


    }


}
