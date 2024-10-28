package day25_encapsulation_inheritance;

public class C04_Runner {

    public static void main(String[] args) {


        C03_EncapsuleRapor obj = new C03_EncapsuleRapor();

        // satis tutari variable'inin degerini yazdirin
        //  System.out.println(obj.satisTutari); private oldugundan goruntuleyemeyiz

        obj.setSatisTutari(100);

        // System.out.println(  obj.setSatisTutari(130) );
        // setSatisTutari() void oldugundan yazdirilamaz

        obj.setSatisTutari(200);
        obj.setSatisTutari(200);
        obj.setSatisTutari(500);
        obj.setSatisTutari(500);


        // toplam satis tutarina deger atayin
        // obj.toplamSatisTutari = 5000; private oldugundan deger atanamaz

        // obj.getToplamSatisTutari() = 500;
        // method bize int bir deger donduruyor,
        // variable olmayan bir seye atama yapilamaz

        System.out.println(obj.getToplamSatisTutari()); // 1000


    }
}
