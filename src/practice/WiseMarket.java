package practice;

import java.util.Scanner;

public class WiseMarket {
    static Scanner scan=new Scanner(System.in);


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
        girisEkrani();
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
    System.out.print("====== Çıkış Yapılıyor  ======");
    Thread.sleep(1500);
    System.out.println(".");
    Thread.sleep(1500);
    System.out.println(".");
    Thread.sleep(1500);
    System.out.println(".");
    scan.close();
    System.exit(0);
    }

}
