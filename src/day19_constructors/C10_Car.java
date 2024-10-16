package day19_constructors;

public class C10_Car {

    /*
        Eger obje olusturulurken istedigimiz degerlere sahip olmasini istersek
        Constructor icinde atama yapabiliriz

        Bir class'da SIGNATURE farkli olmak sartiyla
        istedigimiz kadar constructor olusturabiliriz
     */


    String marka = "marka atanmamis";
    String model = "model atanmamis";
    String renk = "Renk atanmamis";
    int yil = 1900;
    int fiyat ;

    C10_Car(){
        // biz gorunur bir constructor olusturunca
        // Java kendi olusturdugu default constructor'i sildi
        // daha once yazilan ve default constructor'i kullanan
        // objeler CTE vermesin diye
        // silinen default constructor'in yerine
        // bu constructor'i olusturduk
    }

    C10_Car(String mrk , String mdl, String rnk, int yl, int fyt){
        marka = mrk;
        model = mdl;
        renk = rnk;
        yil = yl;
        fiyat = fyt;
    }

    C10_Car(String mrk, String mdl,int yl, int fyt){
        marka = mrk;
        model = mdl;
        yil = yl;
        fiyat = fyt;
    }


    C10_Car(String mrk, String mdl,String rnk, int fyt){
        marka = mrk;
        renk = rnk;
        model = mdl;
        fiyat = fyt;
    }

    C10_Car(String mrk, String mdl,String rnk){
        marka = mrk;
        renk = rnk;
        model = mdl;

    }




    @Override
    public String toString() {
        return "Araba ozellikler ==> " +
                "marka :" + marka +
                ", model :" + model +
                ", renk :" + renk +
                ", yil :" + yil +
                ", fiyat :" + fiyat
                ;
    }



}
