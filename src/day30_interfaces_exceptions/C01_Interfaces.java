package day30_interfaces_exceptions;

import java.util.ArrayList;
import java.util.List;

public class C01_Interfaces {

    static String str = "Ali";


    public static void main(String[] args) {

        // List<String> isimler = new List<>();

        List<String> isimler = new ArrayList<>();


        /*
            data turu sectigimiz List Interface'dir
            Interface'ler full abstract'tir ve constructor'lari yoktur
            child cvlass'larin mutlaka barindirmasi gereken methodlari belirliyor

            int size();
            boolean isEmpty();
            boolean contains(Object o);

            Biz List interface'inden obje olusturabilmek icin
            constructor olarak List'in child class'i olan ArrayList()'i sectik
            ve o class'da

            public int size() {  return size; }
            public boolean isEmpty() {return size == 0;}
            public boolean contains(Object o) {return indexOf(o) >= 0;}

            yukardaki abstract method'lar concrete olarak vardir

         */




    }

    public void method1(){
        System.out.println("C01 method1");
    }

    public void method2(){
        System.out.println("C01 method2");
    }
}
