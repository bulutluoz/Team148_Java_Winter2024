package day10_forLoop;

import java.util.Scanner;

public class C10_RakamlarToplami {

    public static void main(String[] args) {

        // Soru 7- Kullanicidan pozitif bir tamsayi alip,
        //         rakamlar toplamini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfenpozitif bir tamsayi giriniz: ");
        int sayi= scan.nextInt();
        System.out.println("Girmiş olduğunuz sayi: "+sayi); //45861


        int basamakSayisi = (sayi+"").length();
        int rakamlarToplami = 0;


        for (int i = 1; i <=basamakSayisi ; i++) {

            rakamlarToplami += sayi % 10;
            sayi /= 10;
        }

        System.out.println("Sayinin rakamlar toplami : "+rakamlarToplami);
    }
}
