package day29_abstractClasses;

public class C09_ChildOfInterface implements I01_Interface{
    /*
        Java'da bir class'i parent edinmek icin extends keyword kullanilir

        Ancak bir class icin Interface'i parent edinmek istedigimizde
        extends kullanirsak
        "No interface expected here" uyarisi verir
        Cunku class'dan Interface'i inherit etmek icin
        extends degil "implements" keyword'u kullanilir

     */


    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }


    public static void main(String[] args) {

        System.out.println(SAYI1); // 10
        System.out.println(SAYI2); // 20

        // sayi3 = 45;
        // Cannot assign a value to final variable 'sayi3'
        // final variable'lara sonradan deger atanamaz


        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Math.PI); // 3.141592653589793
        System.out.println(Math.E); // 2.718281828459045

        /*
            Java'da variable isimleri kucuk harfle baslar ve
            camelCase'e uygun olarak isimlendirilir

            AMMMMAA
            public static final variable'lar
            Java'da bu durumlarini vurgulamak icin
            buyuk harflerle ve aralarinda _ olacak sekilde ISIMLENDIRILIR
         */


    }
}
