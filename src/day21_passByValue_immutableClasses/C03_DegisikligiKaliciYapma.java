package day21_passByValue_immutableClasses;

import java.util.Scanner;

public class C03_DegisikligiKaliciYapma {


    public static void main(String[] args) {
        // Verilen bir metin kac kelimeden olusursa olussun
        // her kelimenin ilk harfini buyuk, kalan harflerini kucuk olarak duzenleyip
        // metnin son halini bize donduren bir method olusturun

        // orn : ali okula git
        //       output : Ali Okula Git

        System.out.println(metniDuzenle("ali okula hergun yuruyerek gidiyor."));
        // Ali Okula Hergun Yuruyerek Gidiyor.


        // Kullanicidan ismini ve soyismini isteyin
        // girilen isim ve soyismi metniDuzenle() ile duzenleyip
        // isim ve soyismi bu haliyle kaydedin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

        isim = metniDuzenle(isim);

        soyisim = metniDuzenle(soyisim);

        System.out.println("Duzenli hali : " +isim + " " + soyisim);

    }


    public static String metniDuzenle(String metin){ // "oguzhan Melih"
        String[] kelimerArr = metin.split(" "); // [oguzhan, Melih]
        String yeniMetin = "";

        for (int i = 0; i < kelimerArr.length ; i++) { // son kelime haric

            yeniMetin += (kelimerArr[i].substring(0,1).toUpperCase()+
                          kelimerArr[i].substring(1).toLowerCase() );
            if (i< kelimerArr.length-1){
                yeniMetin += " ";
            }
        }
        return yeniMetin;
    }



}
