package day08_StringManipulation;

public class P01_substring {
    public static void main(String[] args) {


    //              012345678901234567890123456789 //
        String str="Java gün geçtikçe güzelleşiyor";
    //              123456789012345678901234567890



        System.out.println(str.length()); //30


        // 19. karakteri yazırın
        System.out.println(str.charAt(19));// ü - bu harfi charAt kullanarak büyük yazdıramayız.
        //char değerlerde string methodlar çalışmaz

        System.out.println(str.substring(19,20).toUpperCase()); //Ü

        //10.karakterden başla sona kadar yazdır
        System.out.println(str.substring(9));//geçtikçe güzelleşiyor

        //10 karakter ile 10.index farklı şeylerdir.
        //index 0'dan başladığı için 10. karakter 9.indexteki karakterdir

        //10.indexten sonrasını yazdır
        System.out.println(str.substring(10)); //eçtikçe güzelleşiyor

        // ilk kelime hariç kalanını yazdır
        System.out.println(str.substring(5)); //gün geçtikçe güzelleşiyor

        //son 6 karakteri yazdır
        System.out.println(str.substring(str.length()-6)); //eşiyor

        //son harfi yazdırın
        System.out.println(str.substring(str.length()-1)); // r
        System.out.println(str.substring(29)); // r

        System.out.println(" "); //boşluk
        System.out.println(str.substring(str.length())); //hiçlik

       // System.out.println(str.substring(str.length()+1)); //StringIndexOutOfBoundsException
       // System.out.println(str.substring(5,2)); //StringIndexOutOfBoundsException

        //ilk 10 karakter yazdırın
        System.out.println(str.substring(0,10));

        System.out.println(str.substring(12,12));








    }
}
