package day10_forLoop;

public class C01_ForLoop {


    public static void main(String[] args) {


        // 1'den 10'a kadar (10 haric) tamsayilari
        // aralarina bir bosluk birakarak yanyana yazdirin


        for (   int i = 1       ;     i < 10            ;      i++     ) {


            System.out.print( i +" " );


        }









        // i : loop boyunca kullanmak istedigimiz degerleri kullanmamiza izin veren gecici variable
        //     sadece loop icerisinde gecerlidir, loop disinda kullanilamaz
        // System.out.println(i);

        // i < 10  boolean sart, bu sart true oldugu muddetce loop calismaya devam eder
        //                               false oldugunda loop biter

        // i++ baslangic degerinden itibaren i'nin nasil degisecegini belirler










    }
}
