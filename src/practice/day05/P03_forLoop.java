package practice.day05;

import java.util.Scanner;

public class P03_forLoop {
    public static void main(String[] args) {
        //  Kullanıcıdan 5 adet sayı isteyiniz
        //  Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        //  bu soruyu continue kullanarak çözünüz.




        Scanner scan  = new Scanner(System.in);
        int toplam=0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Sizden 1 ila 20 arasında 5 adet sayı alacağım.\nLütfen "+i+".sayıyı giriniz");
            int sayi=scan.nextInt();
            if (sayi>=5 && sayi<=10){
                continue;
            }
            toplam+=sayi;

        }
        System.out.println("Toplam= "+toplam);
    }


}
