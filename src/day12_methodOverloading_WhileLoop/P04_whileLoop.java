package day12_methodOverloading_WhileLoop;

import java.util.Scanner;

public class P04_whileLoop {
    public static void main(String[] args) {
   /*

    While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.


    */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi=scan.nextInt();
        int rakamlarToplami=0;

        while(sayi>0){
            rakamlarToplami+=sayi%10;
            sayi=sayi/10;
        }

        System.out.println("Rakamlar Toplamı = " + rakamlarToplami);

    }
    //ÖDEV:While loop kullanarak verilen bir String’i terse cevirip,
    // bu halini bize donduren bir method olusturun.
}
