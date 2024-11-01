package practice.day07;

import java.util.Arrays;

public class P05_mdArrays {
    //Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların
    //toplamını birer birer bulan ve herbir sonucu yeni bir array’in elemanı yapan
    // ve yeni array’i ekrana yazdıran bir program yazınız
    // Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}

    public static void main(String[] args) {
        int arr[][]={ {1,2,3}, {4,5}, {6,7} };

        //Sonuçları yerleştireceğimiz bir array oluşturduk
        int result[]=new int[arr.length];

        //verilen arr arraydeki iç elemanların toplamını bularak result arrayine ekleyelim

        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
            result[i]=sum; //Her bir iç array elemanlarını toplayıp. yeni oluşan array'in elmanı olarak ekleyecek
        }

        // System.out.println(Arrays.toString(result));
        // output: {6, 9, 13}

        System.out.print("output: {");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i< result.length-1){
                System.out.print(",");
            }

        }
        System.out.println("}");






    }
}
