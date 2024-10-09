package day15_arrays_multiDimensionalArrays;

import day14_scope_arrays.C07_TumElementleriArtirma;

import java.util.ArrayList;
import java.util.Arrays;

public class C02_MethodKullanimi {

    public static void main(String[] args) {









        System.out.println("=================");

        // Kullanicidan degerler alarak bir array olusturup, kaydedin

        int[] kullaniciArr = C03_KullaniciyaArrayOlusturtma.arrayOlustur();

        System.out.println(Arrays.toString(kullaniciArr));

        // kullanicidan alarak olusturdugunuz int[] in elemanlarini 5 artirip kaydedin

        kullaniciArr = C07_TumElementleriArtirma.arrayinElementleriniArtir(kullaniciArr,5);

        System.out.println("5'er sayi da bizden olsun : "+ Arrays.toString(kullaniciArr));


        // Verilen asagidaki array’de "a" harfinin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdirin


        String[] harfler = {"a","d","f","e","a","e","d","a","a","e","a"};

        C01_ElemanArama.arraydekiArananElemaninSayisiniYazdir(harfler,"a");
        // Aradiginiz harf, array'de 5 kere kullanilmis


        C01_ElemanArama.arraydekiArananElemaninSayisiniYazdir(harfler,"f");
        // Aradiginiz harf, array'de 1 kere kullanilmis





    }
}
