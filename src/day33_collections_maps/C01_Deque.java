package day33_collections_maps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C01_Deque {

    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList();

        // deque ==> double ended queue ,
        //           kuyruk ama iki taraftan da ekleme cikarma yapabilirsin
        // Butun method'larin ...First() ve ...last() 'lari vardir

        deque.add(23);
        deque.addFirst(45);

        System.out.println(deque); // [45, 23]

        deque.addLast(34);

        System.out.println(deque); // [45, 23, 34]


        deque.removeFirstOccurrence(23); // en bastaki elemani degil, 23'un ilk kullanimini siler
        deque.removeFirst(); // bastaki degerin ne olduguna bakmadan, bastaki elemani siler

        deque.push(67);
        // Pushes an element onto the stack represented by this deque
        // (in other words, at the head of this deque)
        // if it is possible to do so immediately without violating capacity restrictions,
        // throwing an IllegalStateException if no space is currently available.
        // This method is equivalent to addFirst.
        // eger kapasite sinirlamasi yoksa, deque'in basina ekler

        deque.addFirst(98); // hic bir seye bakmadan 98'i basa ekler



    }
}
