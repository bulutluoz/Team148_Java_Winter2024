package day34_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapDepo {

    protected static Map<Integer,String> ogrenciMap = new HashMap<>();

    static {

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
    }

    public static void isimdenListeYazdir(String istenenIsim){
        // 1- ismi gorebilmek icin value'lere ihtiyacimiz var

        Collection<String > valueCollection = ogrenciMap.values();

        System.out.println(valueCollection);

        System.out.println("Ismi " + istenenIsim + " olan ogrenci listesi");

        // 2- her bir value'yu elden gecirip bilgileri kontrol etmek icin for each loop kullanalim
        for (String eachValue : valueCollection){
            // ornegin each bize "Ali-Can-11-H-MF" getirdi

            // 3- value icindeki isim bilgisine ulasmak icin split edelim

            String[] eachValueArr = eachValue.split("-");
            //  [Ali, Can, 11, H, MF]

            // 4- ARTIK istedigimiz bilgiye ulasabiliriz
            //    bizden istenen gorevi yapalim

            //  verilen isme sahip olan ogrencilerin isim, soyisim, sinif ve subelerini yazdirin

            if (eachValueArr[0].equalsIgnoreCase(istenenIsim)){
                System.out.println(
                        eachValueArr[0] + " " +
                                eachValueArr[1] + " " +
                                eachValueArr[2] + " " +
                                eachValueArr[3]
                );
            }



        }
    }

    public static void sinifSubeListesiYazdir(int istenenSinif, String istenenSube){

        System.out.println(istenenSinif+"/"+istenenSube + " sinifi ogrenci listesi");
        // 1- sinif ve subeyi gorebilmek icin value'lere ihtiyacimiz var

        Collection<String> valueCollection = ogrenciMap.values();


        // 2- her bir value'yu elden gecirip bilgileri kontrol etmek icin for each loop kullanalim

        for ( String eachValue:valueCollection){

            // ornegin each bize "Ali-Can-11-H-MF" getirdi
            // 3- value icindeki sinif ve sube bilgisine ulasmak icin split edelim

            String[] eachValueArr = eachValue.split("-");
            //  [Ali, Can, 11, H, MF]

            // 4- ARTIK istedigimiz bilgiye ulasabiliriz
            //    bizden istenen gorevi yapalim

            // verilen sinif ve subedeki tum ogrencilerin isim ve soyisimlerini yazdirin

            if ( (istenenSinif+"").equalsIgnoreCase(eachValueArr[2])
                    && istenenSube.equalsIgnoreCase(eachValueArr[3]) ){

                System.out.println(eachValueArr[0] + " " + eachValueArr[1]);

            }


        }
    }
}
