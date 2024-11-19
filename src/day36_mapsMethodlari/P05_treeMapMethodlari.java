package day36_mapsMethodlari;

import java.util.Map;
import java.util.TreeMap;

public class P05_treeMapMethodlari {

    public static void main(String[] args) {

        /*
        Map<String,Integer> map=new TreeMap<>();
        biz bu göstermde obje2yi treeMap yapmamıza rağmen
        data türü map seçildiği için
        BÜTÜN MAP özelliklerine ulaşabiliriz

        Ama data türü de TreeMap seçilirse
        sadece treeMap'e ozgü methodlar kullanılabilir

         */
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("H",40);
        treeMap.put("T",10);
        treeMap.put("M",50);
        treeMap.put("L",65);
        treeMap.put("C",45);
        treeMap.put("SS",25);
        System.out.println(treeMap);

        //TreeMap index kullanmamasına rağmen doğal sıralı olduğu için
        // baştaki ve sondaki ya da onlardan bir önce ve sonraki elemana ulaşabiliriz
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());

        System.out.println(treeMap.tailMap("M"));
        System.out.println(treeMap.tailMap("L",true));
        System.out.println(treeMap.tailMap("L",false));

        // tailMap() verilen elemandan sona kadar olan entry'leri getirir
        //getirirken ikinci gösterimdeki false başlangıcı alma, true başlangıcı da al anlamı taşır
        //default olarak çalışırsa false çalışır

        System.out.println(treeMap.headMap("L"));
        System.out.println(treeMap.headMap("L",true));
        //headMap() verilen keyden öncekileri getirir

        System.out.println(treeMap.higherKey("H"));
        System.out.println(treeMap.ceilingKey("H"));

        System.out.println(treeMap.descendingMap()); //sıralamayı tersine çevirir
        System.out.println(treeMap.pollFirstEntry());
        System.out.println(treeMap);
    }
}
