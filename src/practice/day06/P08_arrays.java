package practice.day06;

public class P08_arrays {
    /*
     * verilen bir int Arrayde toplamlari istenen degere esit olan sayi ciftlerini
     * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
     * istenenToplam=9;
     *
     */
    public static void main(String[] args) {

        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;
        int sayc=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(istenenToplam==arr[i]+arr[j]){
                    System.out.println(""+arr[i]+" + "+arr[j]+" = "+istenenToplam);
                    sayc++;
                }

            }
            
        }

    }

}
