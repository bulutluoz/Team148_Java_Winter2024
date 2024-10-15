package day18_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C06_SayiBulmacaOyunu {

    public static void main(String[] args) {


        // 0 ile 100 arasinda rastgele bir sayi olusturun

        Random random = new Random();
        int tutulanSayi = random.nextInt(100);

        // Kullanicilardan herkesin bir sayi tahmin etmesini isteyin
        // girilen sayilari bir liste olarak kaydedin
        // Kullanicilar negatif bir sayi girdiginde
        // - olusturulan rastgele sayiyi
        // - yapilan tahminleri
        // - rastgele sayiya en yakin tahmini yazdirin

        int girilenSayi = 0;
        List<Integer> tahminlerListesi = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("bir tahmin giriniz");
            girilenSayi = scanner.nextInt();

            if (girilenSayi >= 0){
                tahminlerListesi.add(girilenSayi);
            }

        }while (girilenSayi >= 0);

        // - olusturulan rastgele sayiyi
        System.out.println("Tuttugum sayi : " + tutulanSayi);
        // - yapilan tahminleri
        System.out.println("Yapilan tahminler listesi : " + tahminlerListesi);

        // - rastgele sayiya en yakin tahmini yazdirin

        // [2,56,78,12,67,97]    tutulanSayi = 44


        int enYakinTahmin = tahminlerListesi.get(0);
        int enAzFark = enYakinTahmin > tutulanSayi ? enYakinTahmin-tutulanSayi : tutulanSayi-enYakinTahmin;


         for (int each :tahminlerListesi){

            int eachFark =  each > tutulanSayi ? each-tutulanSayi : tutulanSayi-each ;


            if (eachFark < enAzFark){
                enYakinTahmin = each;
                enAzFark = eachFark;
            }

        }

        System.out.println("En yakin tahmin : " + enYakinTahmin);


        // [2,56,78,12,67,97]    tutulanSayi = 44




















    }
}
