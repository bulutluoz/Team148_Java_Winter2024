package day12_methodOverloading_WhileLoop;

public class P03_whileLoop {
    public static void main(String[] args) {
   /*
      While loop kullanarak 2 basamakli
      7 ile bolunebilen pozitif tamsayilari yazdirin.

    */

        //while  ile yaptığımız için
        //başlangıç, bitiş değerini ve artış miktarını belirlemeliyiz

        String sayilar="";
        int sayi=10;

        while(sayi<100){

            if(sayi%7==0){
                sayilar+=sayi+",";
            }
            sayi++;
        }
        System.out.println(sayilar);


       /*
        While loop kullanarak 2 basamakli
        7 ile bolunebilen pozitif tamsayilarin toplamını yazdirin.
      */

        int toplam=0;
        int sayi2=10;

        while(sayi2<100){

            if(sayi2%7==0){
              toplam+=sayi;
            }
            sayi2++;
        }
        System.out.println("toplam = " + toplam);
    }
}
