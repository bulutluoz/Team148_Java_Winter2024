package practice;

import java.util.Scanner;

public class WiseMarket {
    static Scanner scan=new Scanner(System.in);
    static int urunKodu;
    static String urunAdi;
    static int urunfiyat;
    static int urunAdedi;


/*
   ====================PROJEMIZ===================================
 ilk programa girildiginde bizi bir menu karsilasin bu secenekler
   1 ŞARKÜTERİ ÜRÜNLERİ
   2 MANAV ÜRÜNLERİ
   3 MARKET ÜRÜNLERİ
   secime göre;
   4-urunleri listele ve
   5-fiyatlari gelsin
   6-Alışveriş bitince fiş yazdırsın.
   7- Fiş yazdırdıktan sonra da çıkış yapılsın.
*/
public static void main(String[] args) throws InterruptedException {
    girisEkrani();
}

    public static void girisEkrani() throws InterruptedException {
        System.out.println("============= WISE MARKET ===========");
        System.out.println("              Hoş geldiniz           ");
        System.out.println();
        System.out.println("Lütfen İşlem Seçimi Yapınız");
        System.out.println("------ Menü -------");
        System.out.println("1-Şarküteri Reyonu\n2-Manav Reyonu\n3-Market Reyonu\n4-Fiş yazdır\n5-Çıkış");
        int secim=scan.nextInt();
        if (secim>=1 && secim<=5){
            switch (secim){
                case 1: sarkuteri(); break;
                case 2: manav(); break;
                case 3: market(); break;
                case 4: fisYazdir(); break;
                case 5: cikis(); break;
            }

            }else{
            System.out.println("Geçersiz bir seçim yaptınız");
            girisEkrani();
        }


    }

    public static void sarkuteri() throws InterruptedException {
        System.out.println("====== Şarküteri Reyonuna Hoşgeldiniz ======");
        System.out.println("Lütfen Satın almak istediğiniz ürün kodunu giriniz" );
        System.out.println("------          Ürün Listesi          ------");
        System.out.println("101-Peynir  200₺\n102-Kaymak  150₺\n103-Sucuk  300₺\n104-Pastırma  250₺\n105-Kavurma  275₺");
        urunKodu= scan.nextInt();
        if (urunKodu>=101 && urunKodu<=105){
            System.out.println(" Kaç Paket Alacaksınız?");
            urunAdedi= scan.nextInt();
            switch (urunKodu){
                case 101:urunAdi="Peynir";
                    urunfiyat=200;
                    System.out.println(urunAdedi+"paket "+urunAdi+" fiyatı: "+(urunfiyat*urunAdedi)); break;
                case 102:
                    urunAdi="Kaymak";
                    urunfiyat=150;
                    System.out.println(urunAdedi+"paket "+urunAdi+" fiyatı: "+(urunfiyat*urunAdedi));break;
                case 103:
                    urunAdi="Sucuk";
                    urunfiyat=300;
                    System.out.println(urunAdedi+"paket "+urunAdi+" fiyatı: "+(urunfiyat*urunAdedi));break;
                case 104:
                    urunAdi="Pastırma";
                    urunfiyat=250;
                    System.out.println(urunAdedi+"paket "+urunAdi+" fiyatı: "+(urunfiyat*urunAdedi));break;
                case 105:
                    urunAdi="Kavurma";
                    urunfiyat=275;
                    System.out.println(urunAdedi+"paket "+urunAdi+" fiyatı: "+(urunfiyat*urunAdedi));break;
                default:
                    System.out.println("Geçersiz Giriş. Yeniden Deneyiniz");
                    sarkuteri();



            }
        }












    }

    public static void manav() throws InterruptedException {
        System.out.println("====== Manav Reyonuna Hoşgeldiniz ======");
        girisEkrani();
    }

    public static void market() throws InterruptedException {
        System.out.println("====== Market Reyonuna Hoşgeldiniz ======");
        girisEkrani();
    }

    public static void fisYazdir() throws InterruptedException {
        System.out.println("====== Bizi Tercih ettiğiniz için Teşekkür Ederiz ======");
        girisEkrani();
    }

    public static void cikis() throws InterruptedException {
    System.out.print("  Çıkış Yapılıyor  ");
    Thread.sleep(500);
    System.out.print(".");
    Thread.sleep(500);
    System.out.print(".");
    Thread.sleep(500);
    System.out.print(".");
    scan.close();
    System.exit(0);
    }

}
