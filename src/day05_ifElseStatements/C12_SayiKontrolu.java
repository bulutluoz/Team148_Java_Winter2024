package day05_ifElseStatements;

import java.util.Scanner;

public class C12_SayiKontrolu {

    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi isteyin
        // kullanici
        // negatif sayi girerse uyarin
        // tek basamakli bir sayi girerse "girdiginiz sayi rakam"
        // kullanici 10-99 arasinda (sinirlar dahil) sayi girerse "iki basamakli sayi"
        // kullanici 100-999 arasinda (sinirlar dahil) sayi girerse "uc basamakli sayi"
        // kullanici 1000 veya daha buyuk sayi girerse "cok buyuk sayi" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        if (sayi<0) System.out.println("Negatif sayi girilemez...");
        else if (sayi <= 9) System.out.println("girdiginiz sayi rakam");
        else if (sayi <= 99) System.out.println("iki basamakli sayi");
        else if (sayi <= 999) System.out.println("uc basamakli sayi");
        else System.out.println("cok buyuk sayi");



    }
}
