package day21_passByValue_immutableClasses;

public class C01_PassByValue {
    public static void main(String[] args) {

        /*
            bir variable'i argument olarak kullanip
            baska bir method'a gonderdigimizde
            Java variable'in kendisini degil VALUE(deger)'sunu gonderir
         */

        String cumle = "java candir";

        uzunlukYazdir(cumle); // method'da "Verilen cumlenin uzunlugu : 11" yazdirir

        buyukHarfeCevir(cumle); // Method'da cumle  : JAVA CANDIR

        System.out.println("main method da cumlenin son hali : " + cumle);
        // main method da cumlenin son hali : java candir
    }


    public static void uzunlukYazdir(String str){

        // cumle'nin uzunlugunu yazdirin

        System.out.println("Verilen cumlenin uzunlugu : " + str. length());

        /*
            cumle variable'i main method icerisinde olusturuldugu icin
            local bir variable'dir
            scope'u main method'dur
            ve main method disindan KULLANILAMAZ

            Eger cumle variable'inin degerini
            uzunlukYazdir()'unda kullanmak istersek
            parametre olarak yollayabiliriz
         */
    }

    public static void buyukHarfeCevir(String cumle){

        cumle = cumle.toUpperCase();

        System.out.println("Method'da cumle  : " + cumle);
    }




}

