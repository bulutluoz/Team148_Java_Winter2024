package practice.day04;

public class P01_forLoop {

    public static void main(String[] args) {


        //for loop dönggüsel yapılması gereken işlemlerde kullanılır
        //Başlangıç ve bitiş noktası belirli ve ilerleme artışı/azalışı sabit olan ritmik işlemler serisinde kullanılır
        // eğer artış/azalış ritmik değilse yani sabit değilse while kullanılır

        //Soru
        /*
            1-180 arasındaki 4 ile bölünebilen sayıları yazdırınız

         */

        for (int i = 1; i <=180 ; i++) {
            if (i%4==0){
                System.out.print(i);
                System.out.print(" ");
            }

        }
        System.out.println("");
        System.out.println("Tersten Geliyoruz...");

        for (int i = 180; i >=1; i-- ){
            if (i%4==0){
                System.out.print(i);
                System.out.print(" ");
            }

        }


    }
}
