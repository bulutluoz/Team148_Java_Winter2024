package day19_constructors;

public class C12_KodOkumaDikkatEdilecekler {

    /*
        Kod okuma sorularinda
        bizi sasirtmak icin
        bekledigimiz atamalar yerine, farkli ve ilgisiz atamalar yapilabilir

        Kod okuma sorularinda biz misafir oldugumuz icin
        kod'da ne islem yapildi ise
        o islemi takip eder
        sonucunu kabul ederiz

        CTE vermedigi surece kod icin yanlis yazilmis diyemeyiz

     */

    int sayi = 23;
    String isim = "Ali";
    char chr = '@';

    C12_KodOkumaDikkatEdilecekler(int sy , String ism){
        sayi = 34;
        isim = ism.toUpperCase();
    }  // 1
    C12_KodOkumaDikkatEdilecekler(){
        chr = '%';
        isim = "Esra";
    } // 2

    C12_KodOkumaDikkatEdilecekler(int sy, String ism, char a){
        isim = ism;
        sayi= sy;

    } // 3

    public static void main(String[] args) {

        C12_KodOkumaDikkatEdilecekler obj3 = new C12_KodOkumaDikkatEdilecekler(22,"Hamza",'p');
        // 3 numarali constructor calisir

        System.out.println(obj3.sayi); // 22
        System.out.println(obj3.isim); // Hamza
        System.out.println(obj3.chr); // @





        C12_KodOkumaDikkatEdilecekler obj2 = new C12_KodOkumaDikkatEdilecekler(5,"Cansu");
        // 1 numarali constructor calisir

        System.out.println(obj2.sayi); // 34
        System.out.println(obj2.isim); // CANSU
        System.out.println(obj2.chr); // @

        C12_KodOkumaDikkatEdilecekler obj1 = new C12_KodOkumaDikkatEdilecekler();
        // obj1 icin 2 numarali constructor calisir
        // parametresiz olsa da degerlerin degismeyecegini garanti edemeyiz
        // kod'u takip etmeliyiz
        System.out.println(obj1.sayi); // 23
        System.out.println(obj1.isim); // Esra
        System.out.println(obj1.chr); // %



    }


}
