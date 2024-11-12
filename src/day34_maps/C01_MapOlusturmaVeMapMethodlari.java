package day34_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_MapOlusturmaVeMapMethodlari {

    public static void main(String[] args) {


        // bir ogrenci map'i olusturalim
        // mapde ogrencilerin no, isim, soyisim, sinif, sube ve bolumleri olsun

        // 1- key ve value ne olacak ve nelerden olusacak
        //    key ==> no  value ==>  isim, soyisim, sinif, sube ve bolumleri


        // 2- value'yu hangi data turunde tutalim
        //    value'yu String olarak tutalim


        // 3- value'deki bilgileri hangi sira ile olusturacagiz
        //    ve nasil birlestirecegiz
        //    bilgileri   "isim-soyisim-sinif-sube-bolum" seklinde tutacagiz

        // 4- bu durumda map icin key ve value data type'lari ne olacak

        Map<Integer, String> ogrenciMap = new HashMap<>();

        System.out.println(ogrenciMap); // {}


        // Map'e ekleme icin put() kullanilir

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        System.out.println(ogrenciMap);

        /*

                {
                    101=Ali-Can-11-H-MF,
                    102=Veli-Cem-10-K-TM,
                    103=Ali-Cem-11-K-TM,
                    104=Ayse-Can-10-H-MF,
                    105=Sevgi-Cem-11-M-TM,
                    106=Sevgi-Can-10-K-MF,
                    107=Esra-Han-11-M-SOZ
                    }
         */


        // map'de kac eleman var ?
        System.out.println(ogrenciMap.size()); //  7

        System.out.println(ogrenciMap.isEmpty()); // false

        // key'i vererek value'u getirtmek istersek
        System.out.println(ogrenciMap.get(101)); // Ali-Can-11-H-MF


        // contains() key ve value ayri olarak kullanilir
        // containsValue() value icindeki bir bolumu degil, bir BUTUN OLARAK value'yu kontrol eder
        System.out.println(ogrenciMap.containsKey(104)); // true
        System.out.println(ogrenciMap.containsKey(110)); // false

        System.out.println(ogrenciMap.containsValue("Can")); // false
        System.out.println(ogrenciMap.containsValue("Esra-Han-11-M-SOZ")); // true

        // update icin replace() KULLANILABILIR
        ogrenciMap.replace(102,"Veli-Cem-10-K-Say");
        // ayni islem put ile de olabilir
        ogrenciMap.put(103,"Ali-Cem-11-K-Say");

        // replace'in bir avantaji olabilir
        ogrenciMap.replace(104,"Ayse-Can-10-H-MF","Ayse-Can-10-H-Soz");
        ogrenciMap.replace(104,"Ayse-Can-10-H-MF","Hamza-Kavas-10-H-Soz");

        System.out.println(ogrenciMap);

        // map'deki tum key'leri ayri bir java yapisina kaydedin
       Set<Integer> ogrenciKeySeti =  ogrenciMap.keySet();

       // map'deki tum value'lari ayri bir java yapisina kaydedin
        Collection<String> ogrenciValueCollection = ogrenciMap.values();

        System.out.println("Tum key'ler : " + ogrenciKeySeti);
        // [101, 102, 103, 104, 105, 106, 107]

        System.out.println("Tum value'ler : " + ogrenciValueCollection);
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-Say, Ali-Cem-11-K-Say, Ayse-Can-10-H-Soz, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]

        // NOT : Eger bize verilen gorev sadece value'ler ile ilgili ise
        //       ogrenciValueCollection kullanabiliriz
        //       AMMMAAA hem key hem de value'ye ihtiyacimiz varsa
        //       ogrenciKeySeti'ni kaydedip, sonra key kullanarak value'ye de ulasabiliriz
    }
}
