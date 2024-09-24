package day06_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C08_Ternary {

    public static void main(String[] args) {

        // kullanicidan bir tamsayi alin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz...");

        int sayi = scanner.nextInt();


        // girilen sayi 100'den kucukse "kucuk sayi" , 100 veya daha buyukse "buyuk sayi" yazdirin

        if (sayi<100){
            System.out.println("kucuk sayi");
        }else {
            System.out.println("buyuk sayi");
        }

        // ternary ile yapalim

        System.out.println( sayi<100 ? "kucuk sayi" :  "buyuk sayi"  );



        // girilen sayi cift ise "cift sayi", tek ise "tek sayi" yazdirin

        if (sayi %2 == 0){
            System.out.println("cift sayi");
        }else {
            System.out.println("tek sayi");
        }

        System.out.println( sayi %2 == 0 ? "cift sayi" :  "tek sayi"  );


    }
}
