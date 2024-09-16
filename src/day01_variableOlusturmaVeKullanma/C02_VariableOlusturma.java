package day01_variableOlusturmaVeKullanma;

public class C02_VariableOlusturma {

    public static void main(String[] args) {

        // kullanicinin yasini tutacagim bir variable olusturmak istiyorum

        // int yas ; // java yas variable icin hafizada yeri ayirir ama henuz deger yok

        int yas = 34; // java variable'i olusturur ve 34 degerini atama yapar

        // dogum gunu geldi ve yas 1 artacak

        // int yas = 35 ; // Variable 'yas' is already defined in the scope

        // Java ayni isimde 2 farkli variable olusturmaniza izin vermez
        // DEKLARASYON sadece 1 kere olur
        // deger atamasi istediginiz kadar olabilir


        // java sout icerisinde "" arasinda yazdigimiz herseyi konsolda yazdirir

        System.out.println("Java Candir"); // Java Candir

        System.out.println("J a v a   C a n d i r"); // J a v a   C a n d i r

        System.out.println(            "Java Candir"             ); // Java Candir


        double boy = 176.4;

        System.out.println(     "boy"   ); // boy


        System.out.println( boy ); // 176.4

        System.out.println( "kullanicinin boyu : "  + boy); // kullanicinin boyu : 176.4


    }
}
