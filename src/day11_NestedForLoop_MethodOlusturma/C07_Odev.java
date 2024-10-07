package day11_NestedForLoop_MethodOlusturma;

public class C07_Odev {

    public static void main(String[] args) {

          /*

              asagidaki sekli cizdirecek kodu yaziniz

               1
              1 2
             1 2 3
            1 2 3 4

                 1
                1 1
               1 2 1
              1 2 2 1
             1 2 3 2 1
            1 2 3 3 2 1

         */


        for (int i = 1; i <=6 ; i++) {  // satirlari

            for (int j = 1; j <=6-i ; j++) {
                System.out.print(" ");
            }


            for (int j = 1; j <=i ; j++) { // her satirdaki sutunlari

                System.out.print( j + " " );

            }
            System.out.println("");
        }
    }
}
