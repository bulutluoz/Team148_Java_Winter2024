package day21_passByValue_immutableClasses;

import java.util.Arrays;

public class C07_Mutable_ImmutableClasses {

    public static void main(String[] args) {

        String str  = "Java candir";

        System.out.println( str.toUpperCase()); // JAVA CANDIR

        System.out.println(str); // Java candir



        String[] isimler = {"Esra","Cansu","Ruya"};

        isimler[1] = isimler[1].toUpperCase();

        System.out.println(Arrays.toString(isimler)); // [Esra, CANSU, Ruya]


        /*
            Java da bazi class'lardan olusturulan objeler
            sonradan DEGISTIRILEMEZ (immutable) . Ornek : String

            ama bazi class'lardan olusturulan objeler
            sonradan degistirilebilir. ornek : arrays ve arrayList

            immutable class'larda method'larla yapilan degisiklikler KALICI OLMAZ iken
            mutable class'larda method'larla yapilan degisiklikler KALICI OLUR
         */


        str = str.toUpperCase();

        String isim1 = "Ali";
        String isim2 = "Ali";
        String s = "A";
        String t = "li";
        String isim3 = s+t;

        System.out.println( isim1 == isim2 ); //  Ali == Ali ==> true
        System.out.println( isim1 == isim3 ); //  Ali == Ali ==> false

    }
}
