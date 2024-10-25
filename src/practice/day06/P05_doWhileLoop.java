package practice.day06;

import java.util.Scanner;

public class P05_doWhileLoop {
    // kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.


    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int pin=0;
       int sPin=9716;

  do {
      System.out.print("Pin Kodunuzu giriniz: ");
       pin=scan.nextInt();
  }while(pin!=sPin);
      System.out.println("Pin kodunu doğru girdiniz!");



// System.out.println("-----------------------------");

//       while(pin!=sPin){
//           System.out.print("Pin Kodunuzu giriniz: ");
//           pin=scan.nextInt();
//       }
//       System.out.println("Pin kodunu doğru girdiniz!");

    }
}
