package day29_abstractClasses;

public abstract class C03_KuralciParent {

    /*
        Parent class'daki method1 ve method2'yi
        BUTUN CHILD class'lar kendilerine UYARLAMAK ZORUNDA olsun

        method3 ve method4 icin bir sey demiyoruz
        klasik inheritance kurallarina uysunlar

        1- Oncelikle Kuralci parent'lar
           kendilerinin kuralci oldugunu DEKLARE ETMELIDIR
           bunun icin class deklarasyonuna abstract keyword eklenmelidir

        2- Abstract class olan parent class'lar
           hangi method'larin child class'lar tarafindan
           implement edilmesinin (kendilerine uyarlama) ZORUNLU OLACAGINI belirler

        3- Child class'larin implement etmesi ZORUNLU olacak method'lar
           abstract method haline getirilir.

           abstract method'lar sadece kurali yazan cumleler gibidir
           standart bir method olmasina gerek yoktur.

        4- Abstract class'daki abstract olmayan method'lar
           child class'lar tarafindan implement edilmek zorunda degildir
           klasik inheritance uygulamalarina tabiidir

        5- Abstract child class'a sonradan abstract bir method eklenirse
           Tum child class'lar bu yeni abstract method'u
           DERHAL kendilerine uyarlamak zorunda kalirlar

           Devam eden bir projede
           bu cok tavsiye edilmez
           cunku child class'lar bu method'u uyguladiginda
           tum uygulamanin ozeliklerini etkileyebilir

           Bu sebeple genellikle
           Abstract yapilara sonradan eklenen method'larin
           abstract method olmamasi tercih edilir

     */

    String str;
    String s;
    static int sayi = 10;

    // beni parent edinen child class method1'i kendine uyarlamak zorundadir
    public abstract void method1();

    public abstract void method2();

    public static void method3(){
        System.out.println("Parent method3");
    }

    public static void method4(){
        System.out.println("Parent method4");

    }

    public abstract int method5();
}
