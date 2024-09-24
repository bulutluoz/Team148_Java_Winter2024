package day06_nestedIfElseStatements_ternary;

public class C02_AndOperatoru {

    public static void main(String[] args) {



        int a = 10;
        int b = 20;

        // && operatoru sonuc odaklidir
        System.out.println( a<b && a%2==0 && b<0 && b%3==0 && b>a+5 ); // false


        // & operatoru islem odaklidir
        System.out.println( a<b & a%2==0 & b<0 & b%3==0 & b>a+5 ); // false



        // EGERRR And ile birlestirilen islemlerde atama yapiliyorsa
        // && bazi islemleri yapmadigi icin atamalar yapilmamis OLABILIR


        boolean sonuc1=true;
        boolean sonuc2=true;
        boolean sonuc3=true;

        boolean genelSonuc =  (sonuc1= a>=b)     &  (sonuc2 = a<b)     &      (sonuc3=a>b-8) ;

        System.out.println(genelSonuc); // false
        System.out.println(sonuc1); // false
        System.out.println(sonuc2); // true
        System.out.println(sonuc3); // false


        boolean sonuc4=true;
        boolean sonuc5=true;
        boolean sonuc6=true;

        boolean genelSonuc3 =  (sonuc4= a>=b)     &&  (sonuc5 = a<b)     &&      (sonuc6=a>b-8) ;

        System.out.println(genelSonuc3); // false
        System.out.println(sonuc4); // false
        System.out.println(sonuc5); // atama olmadi eski deger true
        System.out.println(sonuc6); // atama olmadi eski deger true



    }
}
