package day11_NestedForLoop_MethodOlusturma;

public class C01_NestedForLoop {

    public static void main(String[] args) {


        // bir loop ile 1 2 3 4 yazdirin

        for (int i = 1; i <=4 ; i++) {

            System.out.print(i*1 + " ");
        }

        System.out.println("");


        // ayni loop ile 2 4 6 8 yazdirin

        for (int i = 1; i <=4 ; i++) {

            System.out.print(i*2 + " ");
        }

        System.out.println("");


        // ayni loop ile 3 6 9 12 yazdirin

        for (int i = 1; i <=4 ; i++) {

            System.out.print(i*3 + " ");
        }

        System.out.println("");


        /*
            Tek seferde asagidaki tabloyu yazdirin

            1 2 3 4
            2 4 6 8
            3 6 9 12

            bu tabloda 3 satir
            ve her satirda 4 sutun var

            Eger bizden iki boyutlu bir tablo olusturmamiz istenirse
            ic ice for loop olusturmaliyiz

            disardaki loop (Outer loop) satirlari kontrol eder
            icerdeki loop (Inner loop) her satirdaki sutunlari kontrol eder
         */


        for (int i = 1; i <=3 ; i++) { // satirlari kontrol eder

            for (int j = 1; j <=4 ; j++) { // her satirdaki sutunlari kontrol eder

                System.out.print( i*j + " "   );
            }

            System.out.println("");

        }






    }
}
