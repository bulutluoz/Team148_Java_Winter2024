package day11_NestedForLoop_MethodOlusturma;

public class C09_MethodOlusturmaVeKullanma {

    public static void main(String[] args) {

        // verilen iki notun ortalamasini yazdiran bir method olusturun

        double not1 = 78.9;
        double not2 = 56.5;

        notOrtalamasiYazdir(not1,not2); // Verilen notlarin ortalamasi : 67.7

        notOrtalamasiYazdir(45.6,87.34); // Verilen notlarin ortalamasi : 66.47



    }


    public static void notOrtalamasiYazdir( double not1 , double not2   ){

        System.out.println( "Verilen notlarin ortalamasi : " + (not1+not2)/2 );
    }
}
