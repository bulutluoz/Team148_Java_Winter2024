package day11_NestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class C04_NestedForLoop {

    public static void main(String[] args) {

          /*
            Kullanicidan satir sayisini
            ve her satirdaki * sayisini isteyip
            Girilen degerlere gore
            asagidaki sekli olusturacak bir kod yaziniz

            orn :   satir 4, satirdaki * sayisi 7

            * * * * * * *
            * * * * * * *
            * * * * * * *
            * * * * * * *
         */

        Scanner scanner =new Scanner(System.in);
        System.out.println( "Lütfen satır sayisini giriniz..");
        int satirSayisi = scanner.nextInt();

        System.out.println( "Lütfen satirdaki yildiz sayisini giriniz..");
        int sutunSayisi = scanner.nextInt();


        for (int i = 1; i <=satirSayisi ; i++) { // satirlari

            for (int j = 1; j <=sutunSayisi ; j++) {// her satirdaki sutunlari

                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
