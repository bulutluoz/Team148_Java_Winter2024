package day08_StringManipulation;

import java.util.Scanner;

public class P08_indexOf {
    public static void main(String[] args) {

        //indexOf methodu tek parmetre ile yazılırsa o parametrenin ilk bulunduğu index'i
        // iki parametre olarak yazılırsa da verilen indexten sonra ki ilk kullanımın indexini verir (DİKKAT)


        String str="Çok çalışmam gerekiyor çok";

        // a harfi str'da ilk olarak hangi indexte
        System.out.println(str.indexOf('a')); //5

        //çalış kelimesi hangi indexten itibaren başlıyor
        System.out.println(str.indexOf("çalış")); //4

        //5.indexten sonra aradığında ilk o harfi hangi indextedir
        System.out.println(str.indexOf('o',5));
        // DİKKAT: Aramaya verilen indexten başlar fakat index yazarken baştan sayar

        //metin içinde olmayan bir harf ya da kelime aranırsa
        System.out.println(str.indexOf('x'));
        System.out.println(str.indexOf("murat"));
        //sonuc -1 yazarsa aranan şey metinde yoktur




    }
}
