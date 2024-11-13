package day35_maps_nestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C09_HarfSayilari {

    public static void main(String[] args) {

        // Verilen String bir array'de
        // her bir elementi ve kacar defa kullanildigini yazdirin

        String[] harfler = { "a", "b","d","a","r","a","b","d","d","a", "a" ,"t"};
        // {a=5, b=2, d=3, r=1, t=1}

        Map<String,Integer> harfSayilariMap = new TreeMap<>();


        for (String each :harfler){
            // gelen harf map'de varsa degerini bir artir
            harfSayilariMap.computeIfPresent(each , (k,v)->v+1);

            // gelen harf map'de yoksa degeri 1 olarak map'e ekle
            harfSayilariMap.computeIfAbsent(each , v->1);
        }
        System.out.println(harfSayilariMap); // {a=5, b=2, d=3, r=1, t=1}


        // harf sayilari map'i TreeMap
        // ama data type Map secildigi icin
        // BUTUN MAP'lerle ORTAK OLAN ozelliklere sahip olabilir
        // Hayvanlar class'indaki kartal hareket eder (ucamaz)


        // Data type'i TreeMap olan bir map olusturalim
        // Data Type daha spesifik oldugu icin
        // TUM TreeMap'lerin sahip oldugu PEK COK method'a sahip olur
        // avci kuslardaki kartal ucar,pencelidir,et yer...

        TreeMap<String,Integer> yeniMap = new TreeMap<>();


    }
}
