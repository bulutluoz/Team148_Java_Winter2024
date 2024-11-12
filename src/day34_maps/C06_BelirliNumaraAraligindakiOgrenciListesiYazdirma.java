package day34_maps;

import java.util.Set;

public class C06_BelirliNumaraAraligindakiOgrenciListesiYazdirma extends MapDepo{

    public static void main(String[] args) {

        // verilen baslangic ve bitis numaralari dahil olmak uzere
        // bu numaralar arasindaki ogrencilerin
        // No,isim ve soyismlerini yazdirin

        int basNo = 102;
        int bitNo = 105;


        System.out.println(basNo +" ile " + bitNo + " numaralari arasindaki ogrenci listesi");
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // butun key'leri elden gecirmek icin for-each loop

        for (Integer eachKey :ogrenciKeySeti){

            // bu defa kontrol value'de degil key'de

            if (eachKey >= basNo && eachKey<=bitNo ){

                // isim ve soyisimlere ulasabilmek icin value'ye ihtiyac
                String eachValue = ogrenciMap.get(eachKey);

                // value'deki bilgilere ulasmak icin split yapmaliyiz
                String[] eachValueArr = eachValue.split("-");

                // artik istedigimiz bilgilere ulasabiliriz

                System.out.println(
                        // No,isim ve soyismlerini yazdirin
                        eachKey + " "+
                        eachValueArr[0] + " "+
                        eachValueArr[1]

                );


            }

        }
    }
}
