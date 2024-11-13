package day35_maps_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C07_DahaKarmasikNestedMap {

    public static void main(String[] args) {

         /*
                asagidaki rezervasyon map'ini olusturun
           {
                "firstname" : "Ahmet",
                "lastname" : "Bulut",
                "totalprice" : 500,
                "depositpaid" : false,
                "bookingdates" : {
                       "checkin" : "2024-07-21",
                       "checkout" : "2024-08-10"
                          },
                "additionalneeds" : "wi-fi" }  */
        Map<String,Object> rezervasyonMap = new HashMap<>();

        // once icerdeki innermap'i olusturalim
        Map<String,String> bookingdatesValueMap = new HashMap<>();
        bookingdatesValueMap.put("checkin","2024-07-21");
        bookingdatesValueMap.put("checkout","2024-08-10");

        // ana rezervasyon map'ine tum degerleri ekleyelim
        rezervasyonMap.put("firstname","Ahmet");
        rezervasyonMap.put("lastname","Bulut");
        rezervasyonMap.put("totalprice",500);
        rezervasyonMap.put("depositpaid",false);
        rezervasyonMap.put("bookingdates",bookingdatesValueMap);
        rezervasyonMap.put("additionalneeds","wi-fi");



        // rezervasyonda fiyat 300'den buyuk mu ?

        int fiyat = (Integer)rezervasyonMap.get("totalprice");
        System.out.println(fiyat > 300 ); // true


        // rezervasyon fiyati 400'den buyukse %10 indirim yapin

        if (fiyat > 400){
            fiyat = fiyat*90/100;
            rezervasyonMap.put("totalprice", fiyat);

        }



        // Kullanicinin ismi A ile basliyorsa
        // fiyatta %10 ekstra indirim yapin


        if (   ((String)rezervasyonMap.get("firstname")).startsWith("A")   ){
            fiyat = fiyat*90/100;
            rezervasyonMap.put("totalprice", fiyat);

        }

        System.out.println(rezervasyonMap);
                /*

            {
                firstname=Ahmet,
                additionalneeds=wi-fi,
                bookingdates=  {
                                checkin=2024-07-21,
                                checkout=2024-08-10
                                },
                totalprice=405,
                depositpaid=false,
                lastname=Bulut
             }
         */


        // additionalneeds "breakfast" degilse 20 $ daha indirim yapin




    }
}
