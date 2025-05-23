/*Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index*/

package ArrayListExample;

import java.util.ArrayList;

public class delete {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        int n = 2; // Example: delete 3rd element (index 2)

        System.out.println("Before Deletion: " + colors);
        if (n >= 0 && n < colors.size()) {
            colors.remove(n);
            System.out.println("After deleting element at index " + n + ": " + colors);
        } else {
            System.out.println("Invalid index: " + n);
        }
    }
}
