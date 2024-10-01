package day10_forLoop;

public class C02_ForLoop {

    public static void main(String[] args) {

        // iki basamakli sayilarin toplamini yazdirin

        // 10, 11, 12,.......98, 99

        int toplam = 0;

        for (int i = 10; i <=99 ; i++) {

            toplam += i;

        }

        System.out.println("toplam : " + toplam);


        // 3 basamakli pozitif cift sayilarin toplamini yazdirin

        toplam = 0;

        // 100, 102, 104, ..... 998

        for (int i = 100; i < 1000 ; i+=2 ) {

            toplam += i;
        }

        System.out.println("toplam : " + toplam);



        // 234'den baslayip 673'e kadar (673 dahil) 7'ser 7'ser artirarak
        // sayilari yanyana yazdirin

        // 234, 241, 248 ......... 673'e kadar (673 dahil)


        for (int i = 234 ; i <=673  ; i+=7 ) {

            System.out.print(i + " ");
        }


        System.out.println("");
        // 3 basamakli pozitif tam sayilardan
        // 11'e bolunebilenleri yan yana yazdirin


        for (int i = 100; i <=999 ; i++) {

            if ( i % 11 == 0){
                System.out.print( i + " ");
            }

        }

        System.out.println("");
        // 437 ile 681 (sinirlar dahil) arasinda, 23 ile bolunebilen sayilari
        // yan yana yazdirin

        for (int i = 437; i <=681 ; i++) {

            if ( i % 23 == 0){
                System.out.print( i + " ");
            }
        }

    }
}
