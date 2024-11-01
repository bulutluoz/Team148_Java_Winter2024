package practice.day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P07_List {
    /*
     * Input olarak verilen listteki isimlerden
     * icinde ‘a’ harfi bulunanlari silen bir program yaziniz
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));

        System.out.println(list);
        System.out.println("-------------------------------");

        List<String> newList= new ArrayList<>();
        for (String eleman:list){
            if (!eleman.toLowerCase().contains("a")){
                newList.add(eleman);
            }
        }

        System.out.println("OUTPUT :"+newList);



    }
}
