package practice.day04;

import java.util.Scanner;

public class P05_nestedForLoop {
    public static void main(String[] args) {

// Aşağıdaki şekilde çıktı veren programı print içerisinde
// sadece bir tane # kullanarak yazıdırınız

//            # # # # #
//            # # # # #
//            # # # # #
//            # # # # #
//            # # # # #

        Scanner scan = new Scanner(System.in);
        System.out.print("Satır Sayısı: ");
        int row=scan.nextInt();
        System.out.print("Sütun Sayısı: ");
        int column=scan.nextInt();
        String symbol="#";

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(symbol+" ");
            }
            System.out.println();
        }

    }
}
