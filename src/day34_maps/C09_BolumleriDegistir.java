package day34_maps;

import java.util.Set;

public class C09_BolumleriDegistir extends MapDepo{

    public static void main(String[] args) {

        // ogrenci map'inde tum ogrencileri gozden gecirip
        // verilen eskiBolum bilgisine sahip olanlari
        // yeniBolum olarak update edin

        System.out.println(ogrenciMap);

        String eskiBolum = "TM";
        String yeniBolum = "Say";

        // Tum ogrencilerin key ve value'larini gozden gecirmemiz gerekiyor

        // 1- key'leri bir Set olarak kaydedelim
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();


        // 2- tum key'leri elden gecirmek icin for-each loop lazim

        for(Integer eachKey : ogrenciKeySeti){

            // biz key'leri elden geciriyoruz ama bolum bilgisi value'de
            // eachKey'i kullanarak eskiValue'yu kaydedelim

            String eskiValue = ogrenciMap.get(eachKey); //

            String[] eskiValueArr = eskiValue.split("-");  // [Veli, Cem, 10, K, TM]

            if (eskiValueArr[4].equalsIgnoreCase(eskiBolum)){

                eskiValueArr[4] = yeniBolum; // [Veli, Cem, 10, K, Say]

            }

            String yeniValue = String.join("-",eskiValueArr);
            ogrenciMap.put(eachKey,yeniValue);

        }


        System.out.println(ogrenciMap);

    }
}
