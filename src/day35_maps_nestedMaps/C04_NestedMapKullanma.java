package day35_maps_nestedMaps;

public class C04_NestedMapKullanma extends NestedMapDepo{

    public static void main(String[] args) {

        System.out.println(ogrenciMap);
        /*
            {
                101={sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali},
                102={sinif=10, sube=M, soyisim=Can, bolum=MF, isim=Ipek},
                103={sinif=11, sube=L, soyisim=Can, bolum=MF, isim=Esra},
                104={sinif=10, sube=L, soyisim=Cem, bolum=TM, isim=Maya},
                105={sinif=12, sube=K, soyisim=Kaya, bolum=Soz, isim=Hamza},
                106={sinif=9, sube=M, soyisim=Kaya, bolum=Soz, isim=Dilan}}

         */

        // map'e yeni bir ogrenci ekleyin
        ogrenciyiMapeEkle(107,"Veli","Han","12","K","Soz");

        System.out.println(ogrenciMap);
                /*
            {
                101={sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali},
                102={sinif=10, sube=M, soyisim=Can, bolum=MF, isim=Ipek},
                103={sinif=11, sube=L, soyisim=Can, bolum=MF, isim=Esra},
                104={sinif=10, sube=L, soyisim=Cem, bolum=TM, isim=Maya},
                105={sinif=12, sube=K, soyisim=Kaya, bolum=Soz, isim=Hamza},
                106={sinif=9, sube=M, soyisim=Kaya, bolum=Soz, isim=Dilan}
                107={sinif=12, sube=K, soyisim=Han, bolum=Soz, isim=Veli}}
         */

        // 103 numarali ogrencinin sinifini yazdirin
        System.out.println(ogrenciMap.get(103).get("sinif")); // 11

        // 105 numarali ogrencinin soyismini "Han" yapin
        ogrenciMap.get(105).put("soyisim","Han");

        // 106 numarali ogrencinin sinifi 9 ise 11 olarak duzeltin
        ogrenciMap.get(106).replace("sinif","9","11");

        // 101 numarali ogrencinin soyismi Can ise Han olarak duzeltin
        ogrenciMap.get(101).replace("soyisim","Can","Han");

        // 104 numarali ogrencinin sinifi 11 veya daha kucukse
        // sinifini 1 artirin

        int eskiSinif = Integer.parseInt(ogrenciMap.get(104).get("sinif"));

        int yeniSinif = eskiSinif<=11 ? ++eskiSinif : eskiSinif ;

        ogrenciMap.get(104).put("sinif" ,yeniSinif+"");


        System.out.println(ogrenciMap);



    }
}
