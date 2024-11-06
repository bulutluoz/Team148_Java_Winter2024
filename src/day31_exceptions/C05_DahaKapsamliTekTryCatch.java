package day31_exceptions;

public class C05_DahaKapsamliTekTryCatch {

    public static void main(String[] args) {

        String str = "Java candir";
        int[] arr = {1,2,3,4,5,3,4,2,3,4,5,6,7,5,4,3,4,5,7,6,5,9};

        // verilen negatif olmayan bir sayiyi index olarak kabul edip
        // yukardaki str ve arr'deki o index'de bulunan harfi ve sayiyi yazdirin
        // eger kullanici index'den buyuk sayi girerse
        // hata mesaji ve son index'i yazdirin

        int index = 6;

        if (index < 0 ){
            System.out.println("Index negatif olmamalidir");
        } else {
            // 3.yontem : daha kapsamli tek try catch
            //            Bu yontem digerlerine gore daha kisa
            //            Exception tum hatalari kapsadigi icin
            //            bizim ongoremedigimiz exception'lar da olussa yakalar
            //            Hata ayiklama acisindan yine 1.yontem tercih edilebilir

            // 4.yontem nested try catch
            //          ama kod acisindan anlasilmasi daha zor olacagi icin tercih edilmez
            //          kod okuma sorularinda ornek cozecegiz


            try {
                System.out.println(arr[index]);
                System.out.println(str.charAt(index));

            }catch (Exception e) {

                System.out.println("Index sinirlari disinda, arr son index : " +
                        (arr.length-1) + ", String son index : " +(str.length()-1));
            }


        }// else sonu









    }
}
