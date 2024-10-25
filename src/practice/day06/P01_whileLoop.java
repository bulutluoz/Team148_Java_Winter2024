package practice.day06;

import java.util.Scanner;

public class P01_whileLoop {

    public static void main(String[] args) {
           /*
        // kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
		// kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create
		// ediniz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bölünecek sayıyı giriniz: ");
        int bolunen = scan.nextInt();
        System.out.print("Lütfen bölecek sayıyı giriniz: ");
        int bolen=scan.nextInt();




        bolmeIslemi(bolunen,bolen);

    }

    public static void bolmeIslemi(int bolunen, int bolen) {
            if (bolunen<bolen){
                System.out.println("Bölünen sayı bölecek sayıdan büyük olmalıdır");
            }else{
                int sayac=0;
                int ilkBolunen=bolunen;
                while(bolunen>=bolen){
                    bolunen=bolunen-bolen;
                    sayac++;
                }
                System.out.println(ilkBolunen+ " sayısının "+bolen+" sayısına bölümü "+sayac+" kalan ise "+bolunen+" dir");
            }

    }
}
