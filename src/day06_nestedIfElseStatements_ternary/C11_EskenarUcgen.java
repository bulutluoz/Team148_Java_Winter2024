package day06_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C11_EskenarUcgen {

    public static void main(String[] args) {

        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin,
        // degilse “Eskenar degil” yazdirin.

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz...");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();


        System.out.println( kenar1==kenar2 & kenar1==kenar3 ? "Eskenar ucgen" : "Eskenar degil"  );

    }
}
