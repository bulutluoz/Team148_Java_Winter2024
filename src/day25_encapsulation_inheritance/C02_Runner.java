package day25_encapsulation_inheritance;

public class C02_Runner {

    public static void main(String[] args) {

        /*

            Access Modifier kullanarak
            bir variable'a ulasabiliyorsak
            o variable'i hem kullanabilir
            hem de o variable'a deger atamasi yapabiliriz

         */

        // static variable'lara ulasmak icin
        // obje olusturmaya gerek olmaz,
        // static variable'larin diger adi class variable'lardir
        // class ismi ile birlikte kullanilabilirler

        // System.out.println(C01.strPriS);
        // private ne yaparsaniz yapin class disindan kullanilamaz

        System.out.println(C01.strDefS);
        System.out.println(C01.strProS);
        System.out.println(C01.strPubS);

        C01.strDefS = "Yeni class def";
        C01.strProS = "Yeni class protected";
        C01.strPubS = "Yeni class public";


        // static olmayan variable'lara ulasabilmek icin
        // C01 class'indan obje olusturmaliyiz
        C01 obj = new C01();

        // System.out.println(obj.strPri);
        System.out.println(obj.strDef);
        System.out.println(obj.strPro);
        System.out.println(obj.strPub);

        obj.strDef = "Yeni class def";
        obj.strPro = "Yeni class protected";
        obj.strPub = "Yeni class public";


    }
}
