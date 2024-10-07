package day13_doWhileLoop_scope;

public class C07_Scope_ClassLevelVariables {
    /*


        Class level'da olusturulan variable'larin scope'u tum class'dir
        yani her yerden kullanilabilir olmali

        AMMA direkt kullanilabilir olmasi static keywor'e baglidir

        - static variable'lar her yerde direkt kullanilabilir

        - instance variable'lar static olmayan method'lardan direkt kullanilabilir
          ama static method'lardan direkt KULLANILAMAZ, obje olusturup kullanmamiz gerekir
     */

    public String str = "java candir";
    static String isim;
    static int sayi1 = 10;
    public int numara;
    public boolean emekliMi = true;
    public static boolean aktifMi ;
    public static char ilkHarf ='A';
    static char karakter;

    public static void main(String[] args) {

        System.out.println(isim); // null
        System.out.println(sayi1); // 10
        System.out.println(aktifMi); // false
        System.out.println(ilkHarf); // A
        System.out.println(karakter); // hiclik

        C07_Scope_ClassLevelVariables obj = new C07_Scope_ClassLevelVariables();

        System.out.println(obj.emekliMi); // true
        System.out.println(obj.str); // java candir
        System.out.println(obj.numara); // 0
    }

}
