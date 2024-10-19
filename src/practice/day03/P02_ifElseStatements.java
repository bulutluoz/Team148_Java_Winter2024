package practice.day03;

import java.util.Scanner;

public class P02_ifElseStatements {
    /*   Kullnıcıdan 40'dan büyük bir sayı alın.
        Eğer sayı 5'e bölününce kalan 0 ise ve sayı 8'e bölününce kalan 0 ise
        "able to divide by 5 and 8" yazdırınız.

        Eğer sayı 10'a bölününce kalan 5 ise ve sayının 9'a bölününce kalan 0 ise
        "able to divide by 9 and divide by 10 reminder is 5" yazdırınız.

        yukarıdaki koşulların her iside geçerli değilse sonuç bulunamadı yazsın
    */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen 40'dan büyük bir sayı giriniz: ");
        int sayi=scan.nextInt();

        if(sayi>40){

            if (sayi%5==0 && sayi%8==0){
                System.out.println("able to divide by 5 and 8");
            } else if (sayi%10==5 && sayi%9==0) {
                System.out.println("able to divide by 9 and divide by 10 reminder is 5");
            }else{
                System.out.println(" Sonuç Bulunamadı ");
            }
        }else{
            System.out.println("Sayı 40'tan büyük olmalıydı...");
        }



    }
}
