package practice.day04;

public class P04_StringManipulation {
    public static void main(String[] args) {

     /*
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
      */

        String  str1="%13.99";
        String str2= "%10.55";
        double ind1=Double.parseDouble(str1.substring(1));
        double ind2=Double.parseDouble(str2.substring(1));

        double toplam=ind1+ind2;
        System.out.println("Toplam İndirim = " + toplam);


    }
}
