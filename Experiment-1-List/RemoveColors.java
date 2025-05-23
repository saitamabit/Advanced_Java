/* Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList */

package ArrayListExample;

import java.util.ArrayList;

public class RemoveColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Orange");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Purple");

        // Remove 2nd element (index 1)
        colors.remove(1);

        // Remove "Blue" if still exists
        colors.remove("Blue");

        System.out.println("Updated color list: " + colors);
    }
}

