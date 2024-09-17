package day02_scanner;

import java.util.Scanner;

public class C07_KullaniciDegerleriniYazdirma {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan ismini, soyismini ve yasini alip
        //         asagidaki formatta yazdirin.

        //		girilen bilgiler : J Doe, 44
        //      Kaydiniz basarili sekilde olusturuldu


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        String girilenIsim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");
        String girilenSoyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz...");
        int yas = scanner.nextInt();

        System.out.println(

                "girilen bilgiler : " + girilenIsim.charAt(0) +
                " " + girilenSoyisim + ", " + yas +
                "\nKaydiniz basarili sekilde olusturuldu"

        );



    }
}
