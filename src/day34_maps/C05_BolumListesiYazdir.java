package day34_maps;

import java.util.Set;

public class C05_BolumListesiYazdir extends MapDepo{

    public static void main(String[] args) {

        // verilen bolumdeki tum ogrencilerin
        // Numara, isim,soyisim ve subelerini yazdirin

        String istenenBolum = "tm";



        System.out.println(istenenBolum + " Bolumundeki ogrenci listesi");
        // numara da istendigi icin sadece value yetmez, key'leri kullanmamiz gerekir
        // 1- Tum key'leri kaydedelim
        Set<Integer> ogrenciKeySeti    = ogrenciMap.keySet();

        // 2- Herbir key'i ele almak icin for each loop yapalim

        for (Integer eachKey : ogrenciKeySeti){
            // ornek eachKey : 101

            // foreach loop her bir key'i bize getirecek
            // ama aradigimiz bilgiler key'de degil value'de

            String eachValue = ogrenciMap.get(eachKey); // "Ali-Can-11-H-MF"

            // 3- istenen bilgilere ulasmak icin eachValue'yu split edelim

            String[] eachValueArr = eachValue.split("-");
            //    [Ali, Can, 11, H, MF]

            // 4- artik istenen bilgilere ulasabiliyoruz
            //    verilen gorevi yapalim

            // verilen bolumdeki tum ogrencilerin
            // Numara, isim,soyisim ve subelerini yazdirin

            if (eachValueArr[4].equalsIgnoreCase(istenenBolum)){

                System.out.println(
                        eachKey + " "+
                        eachValueArr[0] + " "+
                        eachValueArr[1] + " "+
                        eachValueArr[3]
                );
            }



        }



    }
}
