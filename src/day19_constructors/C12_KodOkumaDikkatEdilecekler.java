package day19_constructors;

public class C12_KodOkumaDikkatEdilecekler {

    int sayi = 23;
    String isim = "Ali";
    char chr = '@';

    C12_KodOkumaDikkatEdilecekler(int sy , String ism){
        sayi = 34;
        isim = ism.toUpperCase();
    }  // 1

    C12_KodOkumaDikkatEdilecekler(){
        chr = '%';
        isim = "Esra";
    } // 2

    C12_KodOkumaDikkatEdilecekler(int sy, String ism, char a){
        isim = ism;
        sayi= sy;

    } // 3


    public static void main(String[] args) {


    }


}
