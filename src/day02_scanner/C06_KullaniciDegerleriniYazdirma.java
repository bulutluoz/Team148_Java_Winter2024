package day02_scanner;


import java.util.Scanner;

public class C06_KullaniciDegerleriniYazdirma {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip,
        //        asagidaki formatta yazdirin.
        //		Isminiz : John
        //		Soyisminiz : Doe
        //		Yasiniz : 44
        //		Kaydiniz basariyla tamamlanmistir.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        // String girilenIsim1 = scanner.next(); // bu ilk space'e kadar olan kismi alir
        String girilenIsim = scanner.nextLine(); // butun satiri alir


        System.out.println("Lutfen soyisminizi giriniz...");
        String girilenSoyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz...");
        int yas = scanner.nextInt();

        System.out.println(
             "Isminiz : " + girilenIsim +
             "\nSoyisminiz : " + girilenSoyisim +
             "\nYasiniz : " + yas +
             "\nKaydiniz basariyla tamamlanmistir."
        );




    }
}
