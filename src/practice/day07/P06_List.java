package practice.day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P06_List {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(35);
        list.add(12);

        System.out.println(list);


        System.out.println("----------------------------------------------------------");

        List<String> meyveler=new ArrayList<>(Arrays.asList("elma","armut","muz","ananas"));

        System.out.println(meyveler);


        System.out.println("----------------------------------------------------------");

        ArrayList<String> sehirler=new ArrayList<>(List.of("Bursa","İstanbul","Kırıkkale","Ankara"));
        System.out.println(sehirler);
    }
}
