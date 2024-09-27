package practice.day02;

import java.util.Scanner;

public class P01_ifElseStetments {
    public static void main(String[] args) {
           /*
        ÖDEV: Kullanıcıdan bir metin alıp metinde birden fazla a harfi varsa a harfinin ikincisinin
        hangi indexte olduğun yazdırın. Bir tane varsa bir tane var yazdırın

   */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir metin giriniz: ");
        String metin=scan.nextLine();
        System.out.print("Hangi harfi arıyorsunuz: ");
        char harf=scan.next().charAt(0);
        int ilkKullanim=metin.indexOf(harf);
        if (ilkKullanim == -1) {
            System.out.println("Aradığınız harf metinde yoktur");
        }else {
            System.out.println("Aradığınız harfin ilk index no: " + ilkKullanim);
        }

        int ikinciKullanim=metin.indexOf(harf,ilkKullanim+1);
        if (ilkKullanim!=-1 && ikinciKullanim==-1){
            System.out.println("Aradığınız harf sadece 1 tane vardır");
        }else{
            System.out.println("aradığınız harfin ikinci index no: " + ikinciKullanim);
        }
    }
}
