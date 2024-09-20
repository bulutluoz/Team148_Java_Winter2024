package practice.day01;

import java.util.Scanner;

public class P05_dataCasting {
    public static void main(String[] args){
 /*

        Kullanıcıcadan herhangi bir sayı alıp
        bu sayıyı -128 ile +127 arasında olan bir sayıya dönüştürün

   */

        Scanner scan=new Scanner(System.in);
        System.out.print("Bir tamsayı giriniz: ");
        int sayi=scan.nextInt();
        System.out.println((byte)sayi);
    }
}
