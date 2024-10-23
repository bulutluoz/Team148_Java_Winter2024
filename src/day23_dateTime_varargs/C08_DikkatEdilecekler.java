package day23_dateTime_varargs;

public class C08_DikkatEdilecekler {

    public static void main(String[] args) {

        // argument olarak girilen sayilardan
        // sonuncusu haric geriye kalanlari toplayip
        // bulunan toplam deger ile son sayinin carpimini yazdiran
        // bir method olusturun

        islemYap(2,3,4); // 20
        islemYap(1,2,3,4,5); // 50
        islemYap(1,2,3,4,5,6,0); // 0

    }

    //public static void islemYap(int... v , String sonSayi){
        // Vararg parameter must be the last in the list
        // vararg bir parametre varsa, SON PARAMETRE olmak ZORUNDADIR
        // vararg element almada sinir tanimaz, tum elementleri almak ister

    //}

    public static void islemYap(int... v){

        // vararg array altyapisini kullandigi icin
        // son elementi vararg icinde ayirabiliriz


        // vararg'da son element haric, bastaki elementleri toplayin

        int toplam = 0;

        for (int i = 0; i <= v.length-2 ; i++) {

            toplam += v[i];

        }

        System.out.println(toplam * v[v.length-1]);
    }

}
