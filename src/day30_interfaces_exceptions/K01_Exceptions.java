package day30_interfaces_exceptions;

import java.util.Scanner;

public class K01_Exceptions {

    public static void main(String[] args) {

        // Kullanicidan iki tamsayi isteyip
        // sayilari birbirine bolun ve sonucu yazdirin

        /*
            Iyi bir kod yazari
            kod'da nerelerde hata olusabilecegini de ongorur
            ve o hata ihtimallerine karsi
            Java'ya yol gosterir

            Ornegin bu gorevde
            kullanicinin payda olarak 0 girmesini ongorup
            if ile bir cozum uretebiliriz

            AMMMAAA kullanici tamsayi yerine farkli bir deger girerse
            olusacak "InputMismatchException" 'i if else ile cozemeyiz

            Java ongorebilecegimiz bu tur sorunlari
            Java'nin cozup yoluna devam edebilmesi (handle) icin
            bize try-catch bloklari hazirlamistir
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen iki tamsayi giriniz...");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        if (sayi2 == 0){
            System.out.println("bolecek sayi 0 olamaz");
        } else {
            System.out.println(sayi1 / sayi2);
        }




    }
}
