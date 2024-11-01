package practice.day07;

public class P03_mdArrays {
    /*
     * write a method that accepts a 2 dimensional array and finds the max value
     * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
     * Input : {{1,2,3},{4,5},{6,7,8}}
     * Output : 8
     */
    public static void main(String[] args) {

        maxDegerbul();


    }

    public static void maxDegerbul() {
        int arr[][]={{1,2,3},{456,5},{6,121,825}};
        int enBuyuk=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>enBuyuk){
                    enBuyuk=arr[i][j];
                }

            }

        }
        System.out.println("Bu dizideki en büyük sayı: "+enBuyuk);


    }


}
