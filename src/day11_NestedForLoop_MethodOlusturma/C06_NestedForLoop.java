package day11_NestedForLoop_MethodOlusturma;

public class C06_NestedForLoop {

    public static void main(String[] args) {

          /*

              asagidaki sekli cizdirecek kodu yaziniz

            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
         */

        for (int i = 1; i <=5 ; i++) { // satirlari

            for (int j = 1; j <=i ; j++) { // satirdaki sutunlar

                System.out.print( j + " "  );

            }
            System.out.println("");
        }


    }
}
