package day02_scanner;

public class C01_VariableIsimVermeKurallari {

    public static void main(String[] args) {

        // kural 1 : deklarasyon 1 kere olur ama istediginiz kadar deger atamasi yapabilirsiniz

        int sayi = 10;

        int not;

        not = 90;


        // int not = 80; // Variable 'not' is already defined in the scope

        // double not =56.7; // Variable 'not' is already defined in the scope

        // kural 2 : java'da variable isimleri kucuk harfle baslar
        //           ama buyuk harf kullanilsa da Java itiraz etmez
        //           ONEMLI : Java case sensitive'dir yani kucuk, buyuk harfe duyarlidir


        int nOT = 56;
        int noT = 67;
        int Not = 23;

        System.out.println(not); // 90
        System.out.println(Not); // 23

        // slayt'daki kural 2
        int not_ = 23;
        int no$t = 45;
        int n1o2t3 = 90;
        // int no&t = 67; // java isimde _ ve $ disinda ozel karaktere izin vermez
        // int n o t = 87;

        // slayt'daki kural 3

        // int 2not = 32; isim sayi ile baslayamaz

        int _not = 56; // cok da begenilmez
        int $not = 86; // cok da begenilmez


        // slayt'daki kural 4

        // int int = 58; // isim olarak keyword'ler kullanilamaz
        // int class = 34;
        // int public = 81;

        // slayt'daki kural 5

        char ismin_ilk_harfi = 'a';
        char isminIlkHarfi = 'y';
        double sinifinYasOrtalamasi = 12.6;


    }
}
