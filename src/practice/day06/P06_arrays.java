package practice.day06;

import java.util.Arrays;
import java.util.Scanner;

public class P06_arrays {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Diziye eklenecek eleman sayısını giriniz: ");
        int sayi=scan.nextInt();
        int arr[]=new int[sayi];

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(i+1+". sayıyı giriniz: ");
            //int sayi2=scan.nextInt();
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Girilen sayılardan en büyüğü ile en küçüğü arasındaki fark "+ ((arr[arr.length-1] - arr[0])));
    }
}
