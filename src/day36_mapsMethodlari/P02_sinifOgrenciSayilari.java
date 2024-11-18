package day36_mapsMethodlari;

import day35_maps_nestedMaps.NestedMapDepo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class P02_sinifOgrenciSayilari {



        //nestedMap olarak verilen bir öğrenci Map'inde
        //her sınıfta jkaçar öğrenci olduğunu yazdırın

/*
      {
        ogrenciyiMapeEkle(101,"Ali","Cem","11","K","TM");
        ogrenciyiMapeEkle(102,"Ipek","Can","10","M","MF");
        ogrenciyiMapeEkle(103,"Esra","Can","11","L","MF");
        ogrenciyiMapeEkle(104,"Maya","Cem","10","L","TM");
        ogrenciyiMapeEkle(105,"Hamza","Kaya","12","K","Soz");
        ogrenciyiMapeEkle(106,"Dilan","Kaya","9","M","Soz");
      }

 */

    public static void main(String[] args) {
        Map<String, Integer> sinifSayilariMap = new TreeMap<>();

        // Tüm öğrencileri gözden geçireceğiz
        // sadece value'larla iişmiz olduğu için sadece values() kullanılabilir
        // keySet() alip herhangi bir key'e ait value değeri ile çalışabilirim
        // entrySet() alip hem key hem de value ile çalışabilirim


        Collection<Map<String, String>> ogrenciBilgileriMap = NestedMapDepo.ogrenciMap.values();

       // System.out.println(ogrenciBilgileriMap);

/*
        [

        {sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali},
        {sinif=10, sube=M, soyisim=Can, bolum=MF, isim=Ipek},
        {sinif=11, sube=L, soyisim=Can, bolum=MF, isim=Esra},
        {sinif=10, sube=L, soyisim=Cem, bolum=TM, isim=Maya},
        {sinif=12, sube=K, soyisim=Kaya, bolum=Soz, isim=Hamza},
        {sinif=9, sube=M, soyisim=Kaya, bolum=Soz, isim=Dilan}

        ]
 */

        for (Map<String, String> each : ogrenciBilgileriMap) {
            String sinif = each.get("sinif");

            //eğer bir sınıf ismi yoksa eklesin ve valur degerini 1 yapsın
            if (!sinifSayilariMap.containsKey(sinif)) {
                sinifSayilariMap.put(sinif, 1);
            } else { //varsa

                sinifSayilariMap.put(sinif, sinifSayilariMap.get(sinif) + 1);
            }
        }
        System.out.println(sinifSayilariMap);
    }}