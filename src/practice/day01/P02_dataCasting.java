package practice.day01;

import java.util.Scanner;

public class P02_dataCasting {
    public static void main(String[] args) {
 /*

  SORU: Kullanıcıdan bir harf alın ve o  harften sonra gelen 3 harfi sırasıyla yazdırın

   */

        Scanner murat = new Scanner(System.in);
        System.out.print("Lütfen bir harf giriniz: ");
        char harf = murat.next().charAt(0);

        System.out.println("Girdiğiniz " + harf + " harfinden sonra gelen 3 harf: " +
                (char) (harf + 1) + "," + (char) (harf + 2) + "," + (char) (harf + 3));

        /*
        char değeri olarak girilen harfe karşılık gelen bir decimal değer vardır.
        sonraki 3 harf ise 1'er arttırarak bulunur. Fakat harf olarak çıktı almak istersek
        char için casting yapılmalıdır
         */


    }
}
