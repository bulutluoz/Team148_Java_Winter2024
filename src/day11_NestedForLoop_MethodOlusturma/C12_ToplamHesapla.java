package day11_NestedForLoop_MethodOlusturma;

public class C12_ToplamHesapla {

    public static void main(String[] args) {

        // verilen iki tamsayi ve aralarindaki tum tamsayilari toplayip
        // sonucu donduren bir method olusturun

        araliktakiToplamiGetir(4,6);  // calisir ama , yazdirmadigimiz icin goremeyiz
                                                  // kaydetmedigimiz icin kullanamayiz

        System.out.println(araliktakiToplamiGetir(8, 10)); // 27
                            // yazdirir ama tekrar kullanamayiz

        int ikiBasSayilarToplami = araliktakiToplamiGetir(10,99);
                    // yazdirmadigimiz icin konsolda gormeyiz
                    // ama istedigimiz zaman yazdirabilir veya kullanabiliriz

        // iki basamakli sayilarin toplaminin asal olup olmadigini yazdirin

        C11_AsalSayiMi.asalMiYazdir(ikiBasSayilarToplami); // false




    }


    public static int araliktakiToplamiGetir(  int baslangic, int bitis  ){

        int toplam = 0;

        if (baslangic < bitis){

            for (int i = baslangic; i <=bitis ; i++) {

                toplam += i;
            }


        }else {

            for (int i = baslangic; i >=bitis ; i--) {

                toplam += i;
            }

        }

        return toplam;

    }


}
