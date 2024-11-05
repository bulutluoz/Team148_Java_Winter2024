package day30_interfaces_exceptions;

import day25_encapsulation_inheritance.C01;

public class C02_CokParentliClass extends C01_Interfaces
                                  implements I01,I02{
    @Override
    public void method3() {
        System.out.println("Child method3");
    }
    @Override
    public int method4() {

        return 10;
    }

    public static void main(String[] args) {

        C02_CokParentliClass obj = new C02_CokParentliClass();

        System.out.println(I01.str);
        System.out.println(I02.str);
        // System.out.println(obj.str);
        // Reference to 'str' is ambiguous, both 'C01_Interfaces.str' and 'I01.str' match
        System.out.println(C01_Interfaces.str);

        // I02.sayi = 60;
        // I02.str = "Cem";
        // Cannot assign a value to final variable 'sayi'
        C01_Interfaces.str = "Veli";

        /*
            Interface'de tum variable'lar public static ve final olur

            Hangi variable'i kullanmak istersek
            static referans ile ulasabiliriz

            dikkat edecegimiz 2.konu
            Interface'de tum variable'lar  final oldugundan
            yeni deger atamasi YAPILAMAZ

         */


        // method'lari kullanalim

        obj.method1(); // C01 method1
        obj.method2(); // C01 method2
        obj.method3(); // Child method3
        System.out.println(obj.method4()); // 10


        /*
            birden fazla parent'da
            ayni isimde abstract method olabilir

            abstract method'lar
            bize emir veren cumleler oldugundan
            ayni isimde birden fazla abstract method olmasi sorun olusturmaz
            biz o isimdeki method'u kendi class'imiza implement ettigimizde
            herkes mutlu olur

            ANCCCAAAKKK
            ayni isimdeki abstract method'larin
            return type'lari da ayni olmalidir
            aksi durumda
            implement ettigimiz method'un return type'i olarak
            hangisini secsek, oteki itiraz eder
            ve projemiz CALISTIRILAMAZ

            eger 2 interface'i implement etmek istedigimizde
            bu interface'lerde
            ismi ayni ama return type'i farkli olan bir method varsa
            birinden vazgecmek ZORUNDASINIZ




         */


    }





}
