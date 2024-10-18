package day12_methodOverloading_WhileLoop;

import java.util.Scanner;

public class mehmet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String harf = "";
        int toplam = 0;
        int sayac = 0;
        int sayi = 0;
        while (!(harf.equals("Q") || harf.equals("q"))) {
            System.out.println("Toplanmak uzere pozitif tamsayilar giriniz\nCikis yapmak icin Q tusuna basiniz\nSayi: ");
            if (scan.hasNextInt()) {  // Kullanıcının int bir sayı girip girmediğini kontrol ediyor
                sayi = scan.nextInt();
                if (sayi < 0) {
                    System.out.println("Negatif sayi kullanilamaz");
                } else {
                    toplam += sayi;
                    sayac++;
                }
            } else {
                // Harf girdisini alıyoruz ve kontrol ediyoruz.
                harf = scan.next();
                if (!(harf.equals("Q") || harf.equals("q"))) {
                    System.out.println("Lütfen geçerli bir sayı veya 'Q' giriniz.");
                }
            }
        }
        // Sonuçları yazdırıyoruz.
        System.out.println("Girilen pozitif tamsayi adedi: " + sayac);
        System.out.println("Girilen pozitif tamsayilarin toplami: " + toplam);
    }
}

