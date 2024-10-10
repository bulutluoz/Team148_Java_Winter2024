package day16_arrays_MultiDimensioanalArrays;

public class C04_TumElemanlariToplama {

    public static void main(String[] args) {

        int[] sayilar = {3,6,9,1};

        // array'in tum elementlerinin toplamini yazdirin

        int toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) {

            toplam += sayilar[i];

        }

        System.out.println("sayilar array'indeki elementlerin toplami : " + toplam); // 19


        int[][] arr = { {2,3,7},{3,5},{4},{1,2,3,6,8} };
        // array'in tum elementlerinin toplamini yazdirin

        toplam = 0 ;

        for (int i = 0; i < arr.length ; i++) { // outer array'deki inner array'leri kontrol eder

            for (int j = 0; j <arr[i].length ; j++) { // her bir inner array'deki elementleri

                toplam += arr[i][j];

            }
        }

        // EGER iki katli bir array'de TUM ELEMENTLERI gozden gecirmemiz gerekiyorsa
        // yukardaki 2 katli loop'u standart olarak kullanabiliriz

        System.out.println(toplam); // 44

    }
}
