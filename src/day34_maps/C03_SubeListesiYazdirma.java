package day34_maps;

import java.util.Collection;

public class C03_SubeListesiYazdirma extends MapDepo{

    public static void main(String[] args) {

        // verilen sinif ve subedeki tum ogrencilerin isim ve soyisimlerini yazdirin
        int istenenSinif = 10;
        String istenenSube = "K";

        // Sadece value yeterli


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
