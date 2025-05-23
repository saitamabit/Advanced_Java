/*Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList() */

package ArrayListExample;

import java.util.ArrayList;
import java.util.List;

public class SubListColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Gray");
        colors.add("Pink");

        List<String> subList = colors.subList(0, 2); // 0 and 1

        System.out.println("First two colors: " + subList);
    }
}
