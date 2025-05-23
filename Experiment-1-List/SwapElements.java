/**Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/

package LL;

import java.util.LinkedList;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Before swap: " + colors);

        Collections.swap(colors, 0, 2);

        System.out.println("After swap (1st and 3rd): " + colors);
    }
}
