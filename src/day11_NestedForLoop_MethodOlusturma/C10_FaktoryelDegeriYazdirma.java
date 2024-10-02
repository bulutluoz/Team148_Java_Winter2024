package day11_NestedForLoop_MethodOlusturma;

public class C10_FaktoryelDegeriYazdirma {

    public static void main(String[] args) {

        //  18'den kucuk pozitif bir tamsayi verildiginde
        // sayinin faktoryel degerini yazdiracak
        // bir method olusturun

        faktoryelYazdir(4); // 4! = 24
        faktoryelYazdir(6); // 6! = 720

    }


    public static void faktoryelYazdir(int sayi){

        int faktoryelDegeri = 1 ;

        for (int i = sayi; i >= 1 ; i--) {

            faktoryelDegeri *= i ;


        }

        System.out.println(sayi + "! = " + faktoryelDegeri);

    }
}
