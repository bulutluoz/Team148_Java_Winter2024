package day05_ifElseStatements;

import java.util.Scanner;

public class C07_FlagMetodu {

    public static void main(String[] args) {

        // Kullanicidan iki tamsayi isteyin

        // girilen sayilara gore asagidaki degerlendirmeleri yazdirin
        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"
        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int flag = 47;

        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        if (sayi1<sayi2) {
            System.out.println("birinci sayi daha kucuk");
            flag = 72;
        }

        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        if (sayi1 > 0) {
            System.out.println("birinci sayi sifirdan buyuk");
            flag = 72;
        }

        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        if (sayi2>50) {
            System.out.println("ikinci sayi 50'den buyuk");
            flag = 72;
        }

        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"
        if (sayi2 % 5 == 0) {
            System.out.println("ikinci sayi 5'in tam kati");
            flag = 72;
        }

        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin

        // sona gelindiginde flag icin 2 ihtimal var
        // flag basta verdigimiz degere esitse (47) ==> hic bir sart saglanmamis
        // flag if bod'lerinde verilen degere esitse (72) ==> en az bir if body calismistir
        //                                                    ama kac tanesinin calistigini bilmiyoruz

        if (flag == 47) System.out.println("Nasil sayi sectiniz , hicbir sarti saglamiyor");

    }
}
