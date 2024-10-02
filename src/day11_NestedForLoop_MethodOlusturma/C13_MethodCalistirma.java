package day11_NestedForLoop_MethodOlusturma;

public class C13_MethodCalistirma {

    public static void main(String[] args) {

        // 67.9 ile 87.3 'un ortalamasini yazdirin

        C09_MethodOlusturmaVeKullanma.notOrtalamasiYazdir(67.9,87.3);
        // Verilen notlarin ortalamasi : 77.6


        C09_MethodOlusturmaVeKullanma.notOrtalamasiYazdir(47.19,57.43);
        // Verilen notlarin ortalamasi : 52.31


        C10_FaktoryelDegeriYazdirma.faktoryelYazdir(10); // 10! = 3628800

        C10_FaktoryelDegeriYazdirma.faktoryelYazdir(7); // 7! = 5040


        C11_AsalSayiMi.asalMiYazdir(7651); // false


        // 3 basamakli sayilardan asal sayi olanlari yan yana yazdirin
        // 3 basamakli asal sayi adedini yazdirin

        int sayac = 0;

        for (int i = 100; i <=999 ; i++) {

            if ( C14_AsalMiDondur.asalMi(i) == true ){

                System.out.print(i + " ");
                sayac++;
            }

        }

        System.out.println("");
        System.out.println("3 basamakli sayilarda " + sayac + " adet asal sayi var");


    }
}
