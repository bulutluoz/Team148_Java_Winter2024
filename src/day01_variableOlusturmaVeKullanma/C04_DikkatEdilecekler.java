package day01_variableOlusturmaVeKullanma;

public class C04_DikkatEdilecekler {

    public static void main(String[] args) {

        // 1- deklarasyon 1 kere olur, deger atamasi istedigimiz kadar yapilabilir

        int sayi = 30;

        // int sayi = 40; //  Variable 'sayi' is already defined in the scope

        // double sayi = 34.6; // Variable 'sayi' is already defined in the scope

        sayi = 45;

        sayi = sayi + 4;

        sayi = sayi * 5;


        // 2- esitligin sol tarafinda SADECE variable ismi olur
        //    baska bir sey kullanilmasina Java izin vermez

        // 50 = sayi ; // Variable expected

        // sayi * 2 = sayi + 10; // Variable expected

        int sayi1 = 34;

        // sayi + sayi1 = 45; // Variable expected


        // 3- Java'da kullanilan = isareti,
        //    matematikteki = isareti gibi esitligi kontrol etmez
        //    gorevi assignment(atama) dir
        //    Java once ='in sagindaki DEGER'i hesaplar
        //    buldugu degeri soldaki variable'a ATAMA yapar

    }
}
