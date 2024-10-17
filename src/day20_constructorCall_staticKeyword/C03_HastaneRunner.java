package day20_constructorCall_staticKeyword;

public class C03_HastaneRunner {

    public static void main(String[] args) {

        C02_Hastane hems1 = new C02_Hastane();

        System.out.println(hems1.perAdres); // adres atanmamis
        hems1.perIsim = "Asuman";
        hems1.perAdres = "Balgat";
        hems1.hastaneAdresi = "Balgat";



        C02_Hastane hems2 = new C02_Hastane();

        System.out.println(hems2.perAdres); // adres atanmamis
        System.out.println(hems2.hastaneAdresi); // Balgat
        hems2.perIsim = "Cansu";
        hems2.perAdres = "Yenimahalle";
        hems2.hastaneAdresi = "Yenimahalle";

        C02_Hastane hems3 = new C02_Hastane();

        System.out.println(hems3.hastaneAdresi); //

        System.out.println(hems3.perAdres); // adres atanmamis
        System.out.println(hems3.hastaneAdresi); // Yenimahalle
        System.out.println(hems2.hastaneAdresi); // Yenimahalle
        System.out.println(hems1.hastaneAdresi); // Yenimahalle
        System.out.println(C02_Hastane.hastaneAdresi); // Yenimahalle


    }

}
