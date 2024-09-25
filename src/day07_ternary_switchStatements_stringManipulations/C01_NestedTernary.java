package day07_ternary_switchStatements_stringManipulations;

import java.util.Scanner;

public class C01_NestedTernary {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();



        // kullanicidan bir sayi isteyin
        // 0'dan buyukse pozitif,
        // 0'dan buyukdegilse pozitif degil yazdirin

        System.out.println( sayi > 0 ? "pozitif" : "pozitif degil"    );


        // sayi, 0'dan buyukse pozitif,
        // 0'dan kucukse negatif,
        // 0 ise notr yazdirin

        System.out.println( sayi > 0 ? "pozitif"  :   ( sayi < 0 ? "negatif" :  "notr"  )  );



        System.out.println( sayi > 0 ? "pozitif"  :  sayi < 0 ? "negatif" :  "notr" );












    }
}
