package day32_Iterator_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class P03_Iterator {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>(Arrays.asList(2,5,9,12,36,28,39,40,102));
        System.out.println(list);

        Iterator itr=list.iterator();

    //   while(itr.hasNext()){

    //       int sayi=(Integer)itr.next();

    //       if (sayi%2==0){
    //           itr.remove();
    //       }
    //   }

        // Tüm elemanları toplayalım
        int toplam=0;

        while(itr.hasNext()){
            int sayi=(int)itr.next();
            toplam+=sayi;

        }
        System.out.println(toplam);
    }
}
