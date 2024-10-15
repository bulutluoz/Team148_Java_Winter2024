package day18_arrayLists_forEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C05_HarfKullanimSayisiniBulma {

    public static void main(String[] args) {

        // Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz...");
        String cumle = scanner.nextLine();
        // java bizi dusunur, her turlu secenegi hazirlar

        System.out.println("Lutfen aranacak harfi giriniz...");
        String aranacakHarf = scanner.nextLine().substring(0,1);

        String[] karakterlerArr = cumle.split("");
        int sayac = 0;

        // [j, a, v, a,  , b, i, z, i,  , d, u, s, u, n, u, r, ,,  , h, e, r,  , t, u, r, l, u,  , s, e, c, e, n, e, g, i,  , h, a, z, i, r, l, a, r]


        for ( String each :karakterlerArr){

            if (each.equals(aranacakHarf)){
                sayac++;
            }

        }


        if (sayac == 0 ) System.out.println("harf cumlede kullanilmamis");
        else System.out.println("aranan harf cumlede " + sayac + " kere kullanilmis");


    }
}
