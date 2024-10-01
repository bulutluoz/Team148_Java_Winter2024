package day10_forLoop;

public class C03_ForLoop {

    public static void main(String[] args) {


        // 765'den baslayip 543'e kadar (sinirlar dahil)
        // 13 ile bolunebilen sayilari yanyana yazdirin

        for (int i = 765 ; i >= 543  ; i--) {

            if (i % 13 == 0){
                System.out.print(i + " ");
            }
        }


        System.out.println("\n=========");
        // 623'den baslayarak 441'e kadar 9'ar 9'ar azaltarak
        // tum sayilari yanyana yazdirin

        for (int i = 623; i >= 441 ; i-=9 ) {

            System.out.print(i + " ");

        }


    }
}
