package day14_scope_arrays;

public class C08_PozitifElementlerinToplami {

    public static void main(String[] args) {

        // Verilen bir array’deki pozitif tamsayilarin toplamini yazdirin

        int[] arr = {-4,-6,7,2,5,-1,0,4,-5,3};

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

            if ( arr[i] > 0){

                toplam += arr[i];
            }

        }

        System.out.println("pozitif elementlerin toplami : " + toplam);


        System.out.println( pozitifElementlerinToplaminiDondur(arr)  );

    }


    // Verilen bir array’deki pozitif tamsayilari toplayip
    // sonucu bize donduren bir method yaziniz.
    public static  int pozitifElementlerinToplaminiDondur(int[] arr){

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

            if ( arr[i] > 0){

                toplam += arr[i];
            }

        }

        return toplam;

    }
}




