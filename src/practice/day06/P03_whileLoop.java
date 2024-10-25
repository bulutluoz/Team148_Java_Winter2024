package practice.day06;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class P03_whileLoop {
    // Kullnıcıdan bir kelime alıp
    // indexi tek sayi olan karakterleri
    // yazdiran bir code create ediniz


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz: ");
        String kelime = scan.next();
        int index = 0;

        while (index <= kelime.length() - 1){
            if(index%2==1){
                System.out.println(index+". index'teki karakter: "+kelime.charAt(index));
            }
            index++;
        }


    }
}



