package day34_maps;

import java.util.*;

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

    public static void soyisimdenListeYazdir(String istenenSoyisim){
        // 1- ismi gorebilmek icin value'lere ihtiyacimiz var

        Collection<String > valueCollection = ogrenciMap.values();

        System.out.println(valueCollection);

        System.out.println("Soyismi " + istenenSoyisim + " olan ogrenci listesi");

        // 2- her bir value'yu elden gecirip bilgileri kontrol etmek icin for each loop kullanalim
        for (String eachValue : valueCollection){
            // ornegin each bize "Ali-Can-11-H-MF" getirdi

            // 3- value icindeki isim bilgisine ulasmak icin split edelim

            String[] eachValueArr = eachValue.split("-");
            //  [Ali, Can, 11, H, MF]

            // 4- ARTIK istedigimiz bilgiye ulasabiliriz
            //    bizden istenen gorevi yapalim

            // Verilen soyisme sahip ogrencilerin
            // Isim, sinif ve subelerini liste olarak yazdirin
            if (eachValueArr[1].equalsIgnoreCase(istenenSoyisim)){
                System.out.println(
                        eachValueArr[0] + " " +
                        eachValueArr[2] + " " +
                        eachValueArr[3]
                );
            }



        }
    }

    public static void bolumListesiYazdir(String istenenBolum){

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

    public static void numaraAraligindakiOgrenciListesi(int basNo, int bitNo) {

        System.out.println(basNo + " ile " + bitNo + " numaralari arasindaki ogrenci listesi");
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // butun key'leri elden gecirmek icin for-each loop

        for (Integer eachKey : ogrenciKeySeti) {

            // bu defa kontrol value'de degil key'de

            if (eachKey >= basNo && eachKey <= bitNo) {

                // isim ve soyisimlere ulasabilmek icin value'ye ihtiyac
                String eachValue = ogrenciMap.get(eachKey);

                // value'deki bilgilere ulasmak icin split yapmaliyiz
                String[] eachValueArr = eachValue.split("-");

                // artik istedigimiz bilgilere ulasabiliriz

                System.out.println(
                        // No,isim ve soyismlerini yazdirin
                        eachKey + " " +
                                eachValueArr[0] + " " +
                                eachValueArr[1]

                );


            }

        }
    }

    public static void kullaniciyaYeniOgrenciOlusturtma(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ogrenci no giriniz");
        int key = scanner.nextInt();

        String value = "";
        scanner.nextLine();

        System.out.println("ogrenci ismi ?");
        value += scanner.nextLine();
        value+= "-";

        System.out.println("ogrenci soyismi ?");
        value += scanner.nextLine();
        value+= "-";

        System.out.println("ogrenci sinif ?");
        value += scanner.nextLine();
        value+= "-";

        System.out.println("ogrenci sube ?");
        value += scanner.nextLine().toUpperCase();
        value+= "-";

        System.out.println("ogrenci bolum ?");
        value += scanner.nextLine();


        ogrenciMap.put(key,value);

    }

    public static void numaraIleSoyisimUpdate(int ogrenciNo, String yeniSoyisim){

        // once ogrencinin eski value'sunu alalim

        String eskiValue = ogrenciMap.get(ogrenciNo); // "Veli-Cem-10-K-TM"

        // Value birlesik bilgilerden olusuyor,
        // soyisme ulasmak ve update etmek icin eski value'yu split etmemiz gerekir

        String[] eskiValueArr = eskiValue.split("-");
        // [Veli, Cem, 10, K, TM]

        // artik yeni soyismi array'e atayabiliriz

        eskiValueArr[1] = yeniSoyisim;
        // [Veli, Kaya, 10, K, TM]


        String yeniValue = String.join("-",eskiValueArr); // "Veli-Kaya-10-K-TM"

        ogrenciMap.put(ogrenciNo,yeniValue);
    }

    public static void bolumGuncelle( String eskiBolum, String yeniBolum){
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

                // tum ogrencileri yeniden birlestirip,
                // map'i her ogrenci icin update etmesini istemezsek
                // guncellemeyi if icinde yapmaliyiz
                String yeniValue = String.join("-",eskiValueArr);
                ogrenciMap.put(eachKey,yeniValue);

            }



        }

    }

}
