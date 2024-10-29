package day26_inheritance;

import day25_encapsulation_inheritance.C09_Toyota;

public class C01_Corolla extends C09_Toyota {

    /*
       1- baslangic itibariyle parent'i olan Toyota
          ve grand parent'i olan araba class'larindaki
          tum ozelliklere sahiptir

       2- Corolla class'i parent ve grand parent class'larindaki
          istedigi variable'lari kendisine UYARLAYABILIR

       3- Corolla class'i butun corolla araclarda olan
          ama parent class'i Toyota veya grand parent'i olan Araba class'larinda olmayan
          YENI variable'lar ekleyebilir

     */

    String model = "Corolla";
    String kasa = "Corolla kasasi";
    String motor = "vvdi";
    String lastik = "15 inch Pirelli";

    String uretimYeri = "Turkiye";
    String aku = "Inci aku";
    String renk = "renk secilmedi";
    String yakitTuru = "yakit turu secilmedi";

    C01_Corolla(){
        //System.out.println(marka); // Toyota
        //System.out.println(motor); // Cevreye duyarli motor
        //System.out.println(kasa); // Kasa secilmedi
    }

    public static void main(String[] args) {

        C01_Corolla corolla1 = new C01_Corolla();

        System.out.println(corolla1.sanzuman); // A Sanzuman secilmedi

        System.out.println(corolla1.marka); // T Toyota
        System.out.println(corolla1.guvenlik); // T DGS1001
        System.out.println(corolla1.fren); // T ABS

        System.out.println(corolla1.model); // C Corolla
        System.out.println(corolla1.kasa); // C Corolla Kasasi
        System.out.println(corolla1.motor); // C vvdi
        System.out.println(corolla1.lastik); // C 15 inch Pirelli
        System.out.println(corolla1.uretimYeri); // C Turkiye
        System.out.println(corolla1.aku); // C Inci aku
        System.out.println(corolla1.renk); // C renk secilmedi
        System.out.println(corolla1.yakitTuru); // C yakit turu secilmedi

        corolla1.sanzuman = "Otomatik";
        corolla1.kasa = "Corolla sedan";
        corolla1.renk = "Kirmizi";
        corolla1.yakitTuru = "Hybrit";
    }

}
