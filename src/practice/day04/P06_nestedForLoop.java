package practice.day04;

public class P06_nestedForLoop {

    public static void main(String[] args) {


 /*
                  1
                 1 1
                1 2 1
               1 2 2 1
              1 2 3 2 1
             1 2 3 3 2 1


                  1
                 1 2
                1 2 3
               1 2 3 4
              1 2 3 4 3
             1 2 3 4 5 4

Process finished with exit code 0


yazdıracak java kodunu sadece for loop ile yazdırınız
  */

        int row = 6;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }

            int num = 1;
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print(num + " ");

                if (j < i ) {
                    num++;
                } else {
                    num--;
                }

            }
            System.out.println();
        }
    }
}
