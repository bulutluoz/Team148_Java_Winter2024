package day08_StringManipulation;

public class P03_Contains {
    public static void main(String[] args) {


        // Verilen bir string variable içinde başka bir string variable olup olmadığını kontrol eder
        // Kontrol edip sonuc olarak kaç tane olduğunu vermez varsa true yoksa false verir. Yani boolean sonuç döner
        // Contains case sensitive'dir buna göre arama yapar
        // parametre olarak sadece string değer kabul eder

        String str="Ne güzel 1 gün";
        int sayi=1;

        System.out.println(str.contains("e")); //true

        System.out.println(str.contains("ne")); //false

        System.out.println(str.contains("güzel")); //true

        System.out.println(str.contains("üz")); //true
        System.out.println(str.contains(1+""));  //true
        // contains methodu string dışında parametre kabul etmez. Bu nedenle int olan 1 değerini string' çevirmek gerekir
        // yanına string bir hiçlik koyduğumuzda bu bizim içerdeki tüm değerlerin string algılanmasını sağlar

        System.out.println(str.contains("1")); //true
        System.out.println(str.contains(sayi+"")); //true
        System.out.println(str.contains("Ne  güz")); //false










    }
}
