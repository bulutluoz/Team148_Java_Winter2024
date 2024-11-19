package day36_mapsMethodlari;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class P04_mapsMethodlari {

    public static void main(String[] args) {


        Map<String,Integer> map = new TreeMap<>();

        map.put("W", 10);
        map.put("I", 40);
        map.put("S", 25);
        map.put("E", 100);

        System.out.println("ilk Map: "+map);
        map.replace("I",60);
        System.out.println(map);

        map.replace("S",30); // map.put("S",30); ile aynı sonucu verir
        //varolan key'lerde put ile replace arasında bir fark yoktur
        System.out.println(map);
        map.put("W",140);
        System.out.println(map);

        map.replace("Y",2024);
        //var olmayan bir key için put kullanrsanız ekler ama replace derseniz hiçbir işlem yapmaz
        System.out.println(map);


        map.replace("W",140,1980);
        System.out.println(map);
        // bu methodda önce eski değere(ilk yazılana) bakar doğru ise 2. yazılanı onunla değiştirir


        map.replace("W",140,145);
        System.out.println(map);

        System.out.println(map.getOrDefault("X", 500));

        map.remove("W",1980);
        System.out.println(map);



    }
}
