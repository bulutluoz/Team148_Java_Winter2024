package day14_scope_arrays;

public class C01_Hastane {

    static String hastaneIsmi  = "Yildiz Hastanesi";
    static String hastaneAdresi = "Yenimahalle";
    static String bashekim = "Doktor Ali";

    String perIsmi = "Isim atanmadi";
    String perAdres = "Adres atanmadi";
    String perTel = "Telefon atanmadi";


    public static void main(String[] args) {

        System.out.println(hastaneAdresi); // Yenimahalle

        C01_Hastane per1 = new C01_Hastane();
        per1.perIsmi = "Yelda";
        per1.perAdres = "Sincan";
        per1.perTel = "5552353534";

        System.out.println(per1.bashekim); // Doktor Ali
        // Static member 'bashekim' accessed via instance reference

        /*
            static variable'lar class icinde her yerden DIREKT kullanilabilir

            eger static variable'lara
            obje uzerinden kullanmak isterseniz Java buna da itiraz etmez
            sadece static variable'a niye instance muamelesi yapiyorsun diye SARARTIR

         */


        C01_Hastane per2 = new C01_Hastane();

        per2.perIsmi = "Oguzhan";
        per2.perAdres = "Cankaya";

        per2.hastaneAdresi = "Cankaya";


        // per2'nin yaptigi atamalar per1'i etkiler mi ?

        System.out.println(per1.perIsmi); // Yelda
        System.out.println(per1.hastaneAdresi); // Cankaya



        C01_Hastane per3 = new C01_Hastane();

        per3.perIsmi = "Esra";
        per3.hastaneAdresi = "Mamak";
        per3.bashekim = "Dr Ipek";


        /*
            per3'un yaptigi atamalardan
            kisisel olanlar ( instance variables) diger personeli etkilemez
            ANCAAKKK ortak olanlar (static variables ) tum personeli etkiler
         */

        System.out.println(bashekim); // Dr Ipek
        System.out.println(per1.bashekim); // Dr Ipek
        System.out.println(per2.bashekim); // Dr Ipek
        System.out.println(per3.bashekim); // Dr Ipek


        System.out.println(per1.perIsmi); // Yelda
        System.out.println(per2.perIsmi); // Oguzhan
        System.out.println(per3.perIsmi); // Esra

    }


}
