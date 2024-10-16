package day19_constructors;

public class C11_CarRunner {

    public static void main(String[] args) {

        C10_Car car1 = new C10_Car();

        System.out.println(car1);
        // Araba ozellikler ==> marka :marka atanmamis, model :model atanmamis, renk :Renk atanmamis, yil :1900, fiyat :0
        car1.marka = "Toyota";
        car1.model = "Corolla";
        car1.renk = "mavi";
        car1.yil = 2020;
        car1.fiyat = 8900;

        System.out.println(car1);
        // Araba ozellikler ==> marka :Toyota, model :Corolla, renk :mavi, yil :2020, fiyat :8900


        C10_Car araba2 = new C10_Car("Nissan","Note","yesil",2017,3500);

        System.out.println(araba2);
        // Araba ozellikler ==> marka :Nissan, model :Note, renk :yesil, yil :2017, fiyat :3500


        C10_Car araba3 = new C10_Car("Tofas","Sahin","Beyaz",2000,10000);

        System.out.println(araba3);
        // Araba ozellikler ==> marka :Tofas, model :Sahin, renk :Beyaz, yil :2000, fiyat :10000


        C10_Car araba4 = new C10_Car("BMW","5.20",2005,4000);
        System.out.println(araba4);
        // Araba ozellikler ==> marka :BMW, model :5.20, renk :Renk atanmamis, yil :2005, fiyat :4000
    }
}
