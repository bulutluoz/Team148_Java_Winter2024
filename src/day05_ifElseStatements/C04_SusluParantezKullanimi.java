package day05_ifElseStatements;

import java.util.Scanner;

public class C04_SusluParantezKullanimi {

    public static void main(String[] args) {

        // kullanicidan 2 tamsayi isteyin

        // birinci sayi daha kucukse
        // iki sayiyi yazdirin
        // alt satira gecip "ilk sayi daha kucuk" yazdirin

        // 2.sayi cift ise
        // "2.sayi cift" yazdirin
        // alt satira "cift sayilari severim" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        /*
        if (sayi1 < sayi2){
            System.out.println("Girilen sayilar : " + sayi1 + " ve " + sayi2);
            System.out.println("ilk sayi daha kucuk");
        }

        if (sayi2 % 2 == 0){
            System.out.println("2.sayi cift \ncift sayilari severim");
        }

         */


        /*
            Eger if cumlesinde boolean sarttan sonra { } kullanilmazsa
            Java if body'si olarak ilk ;'e kadar olan kismi alir
            sonraki satirlarin if ile ilgisi olmaz

            Kullanimda suna dikkat etmeliyiz

            Eger if body'si SADECE 1 satir ise
            { } kullanmasak da olabilir
            ANCAKKK if body'si 1 satirdan daha fazla ise
            MUTLAKA { } kullanmaliyiz
         */
        if (sayi1 < sayi2)
            System.out.println("Girilen sayilar : " + sayi1 + " ve " + sayi2);
            System.out.println("ilk sayi daha kucuk"); // bu satirin yukardaki if ile hicbir baglantisi yok
                                                       // bu satir HER DURUMDA calisir

        if (sayi2 % 2 == 0)
            System.out.println("2.sayi cift \ncift sayilari severim");




    }
}
