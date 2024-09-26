package day08_StringManipulation;

import org.w3c.dom.ls.LSOutput;

public class P10_isEmptyisBlank {


/*
        isEmpty: verilen string'içinin boş olup olmadığını kontrol eder
                 hiçlikleri boş derken space ile boşluk bırakılırsa boş değil der

        isBlank: isEmpty'den farklı olarak sadece hiçlik için değil
                 space ile bırakıan boşlukları da boş olarak kabul eder

  */

    public static void main(String[] args) {
        String str1="Java çok güzel";
        String str2="";
        String str3="      ";


        System.out.println(str1.isEmpty()); //false
        System.out.println(str2.isEmpty()); //true
        System.out.println(str3.isEmpty()); //false
        System.out.println("--------------------------");
        System.out.println(str1.isBlank()); //false
        System.out.println(str2.isBlank());//true
        System.out.println(str3.isBlank());//true
    }



}
