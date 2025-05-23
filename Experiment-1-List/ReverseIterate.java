/*Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())*/

package LL;

import java.util.LinkedList;
import java.util.Iterator;

public class ReverseIterate {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        Iterator<String> descendingIterator = colors.descendingIterator();

        System.out.println("Reverse order iteration:");
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
    }
}
