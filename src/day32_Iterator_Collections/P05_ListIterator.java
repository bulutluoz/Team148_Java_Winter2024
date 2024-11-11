package day32_Iterator_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class P05_ListIterator {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 36, 12, 34, 23, 25, 15, 9, 203));

        // List içindeki elemanların her birini 2 arttıralım

        ListIterator lit = list.listIterator();

        while (lit.hasNext()) {
            lit.set((int) lit.next() + 2);
        }
        System.out.println(list); // [4, 38, 14, 36, 25, 27, 17, 11, 205]

        // her bir elemanın yanına onun 2 eksiğini ekleyelim

        lit = list.listIterator();
        while (lit.hasNext()) {
            lit.add((int) lit.next() - 2);
        }
        System.out.println(list); // [4, 2, 38, 36, 14, 12, 36, 34, 25, 23, 27, 25, 17, 15, 11, 9, 205, 203]

    }
}
