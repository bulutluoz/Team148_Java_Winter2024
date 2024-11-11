package day32_Iterator_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class P08_LinkedListQueue {

    public static void main(String[] args) {

        Queue<Integer> sayilar = new LinkedList<>();

        sayilar.add(1);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(48);
        System.out.println(sayilar); // [1, 20, 30, 48]

        sayilar.add(100);
        System.out.println(sayilar); // [1, 20, 30, 48, 100]

        // Queue yapısı gereği elemanların eklendiği sırayla ekler
        // hiçbir zaman araya eleman eklemez
        // Eklenecekler her zaman sondan eklenir

        sayilar.remove();
        System.out.println(sayilar); // [20, 30, 48, 100]

        // Bir eleman çıkarılacaksada o eleman her zaman baştaki eleman olur

        System.out.println(sayilar.remove()); // 20
        System.out.println(sayilar); // [30, 48, 100]

        System.out.println(sayilar.poll()); // 30
        System.out.println(sayilar); // [48, 100]

        // remove ile poll arasındaki fark boş bir liste olduğu zaman görülür
        // remove boş bir listeyle çalışınca exception verir
        // poll ise bize null döndürür, exception vermez

        Queue<Integer> sayilar2 = new LinkedList<>();
        // sayilar2.remove(); NoSuchElementException
        sayilar2.poll();

        System.out.println(sayilar.peek()); // 48  baştaki elemanı alır
        System.out.println(sayilar2.peek()); // null


        System.out.println(sayilar); // [48, 100]

        sayilar.add(20);
        sayilar.add(45);

        System.out.println(sayilar); //  [48, 100, 20, 45]

        sayilar.remove();

        System.out.println(sayilar); // [100, 20, 45]


        System.out.println(sayilar.poll());
        //Retrieves and removes the head of this queue, or returns null if this queue is empty.
        // queue'nun basindaki elementi siler ve bize getirir, eger queue bossa null dondurur


    }

}
