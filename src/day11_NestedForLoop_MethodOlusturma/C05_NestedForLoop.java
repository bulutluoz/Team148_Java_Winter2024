package day11_NestedForLoop_MethodOlusturma;

public class C05_NestedForLoop {

    public static void main(String[] args) {

        /*

              asagidaki sekli cizdirecek kodu yaziniz

            *
            * *
            * * *
            * * * *
            * * * * *
         */


        for (int i = 1; i <=5 ; i++) { // satirlar

            for (int j = 1; j <= i ; j++) { // her satirdaki sutunlar

                System.out.print("* ");

            }
            System.out.println("");
        }

    }
}
