package day13_doWhileLoop_scope;

public class C08_Hastane {

    static String hastaneIsmi  = "Yildiz Hastanesi";
    static String hastaneAdresi = "Yenimahalle";
    static String bashekim = "Doktor Ali";

    String perIsmi = "Isim atanmadi";
    String perAdres = "Adres atanmadi";
    String perTel ="Telefon atanmadi";


    public static void main(String[] args) {

        C08_Hastane per1 = new C08_Hastane();

        System.out.println(per1.perIsmi); // Isim atanmadi
        System.out.println(per1.perAdres); // Adres atanmadi
        System.out.println(per1.perTel); // Telefon atanmadi

        per1.perIsmi = "Hamza";
        per1.perTel = "5443454545";
        per1.perAdres = "Balgat";


        System.out.println(per1.perIsmi); // Hamza
        System.out.println(per1.perAdres); // Balgat
        System.out.println(per1.perTel); // 5443454545


        C08_Hastane per2 = new C08_Hastane();
        System.out.println(per2.perIsmi); // Isim atanmadi
        System.out.println(per2.perAdres); // Adres atanmadi
        System.out.println(per2.perTel); // Telefon atanmadi

        per2.perIsmi = "Cansu";
        per2.perTel = "5343423221";
        per2.perAdres = "Yenimahalle";

        System.out.println(per2.perIsmi); // Cansu
        System.out.println(per2.perAdres); // Yenimahalle
        System.out.println(per2.perTel); // 5343423221

        System.out.println(per1.perAdres); // Balgat


        C08_Hastane per3 = new C08_Hastane();


        //System.out.println(perIsmi);
        //System.out.println(perAdres);
        //System.out.println(perTel);


        System.out.println(per1.perIsmi); // Hamza
        System.out.println(per2.perIsmi); // Cansu
        System.out.println(per3.perIsmi); // Isim atanmadi

        // per2 nin adresini Cankaya yapin

        per2.perAdres = "Cankaya";

        System.out.println(per1.perAdres); // Balgat
        System.out.println(per2.perAdres); // Cankaya
        System.out.println(per3.perAdres); // Adres atanmadi



    }
}







