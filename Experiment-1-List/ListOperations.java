/*1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
and a LinkedList to perform the following operations with different functions directed as
follows
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list */


package ListExamples;
import java.util.*;

public class ListOperations {

    public static void main(String[] args) { 
        // 1. Create ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // Elements to add
        List<String> initialFruits = Arrays.asList("Apple", "Banana", "Orange");

        // 1. Adding elements
        arrayList.addAll(initialFruits);
        linkedList.addAll(initialFruits);
        System.out.println("1. Initial ArrayList: " + arrayList);
        System.out.println("   Initial LinkedList: " + linkedList);

        // 2. Adding element at specific index
        arrayList.add(1, "Mango");
        linkedList.add(1, "Mango");
        System.out.println("\n2. After adding 'Mango' at index 1:");
        System.out.println("   ArrayList: " + arrayList);
        System.out.println("   LinkedList: " + linkedList);

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Grapes", "Pineapple");
        arrayList.addAll(moreFruits);
        linkedList.addAll(moreFruits);
        System.out.println("\n3. After adding more fruits:");
        System.out.println("   ArrayList: " + arrayList);
        System.out.println("   LinkedList: " + linkedList);

        // 4. Accessing elements
        System.out.println("\n4. Accessing element at index 2:");
        System.out.println("   ArrayList: " + arrayList.get(2));
        System.out.println("   LinkedList: " + linkedList.get(2));

        // 5. Updating elements
        arrayList.set(2, "Kiwi");
        linkedList.set(2, "Kiwi");
        System.out.println("\n5. After updating index 2 to 'Kiwi':");
        System.out.println("   ArrayList: " + arrayList);
        System.out.println("   LinkedList: " + linkedList);

        // 6. Removing elements
        arrayList.remove("Banana");
        linkedList.remove("Banana");
        System.out.println("\n6. After removing 'Banana':");
        System.out.println("   ArrayList: " + arrayList);
        System.out.println("   LinkedList: " + linkedList);

        // 7. Searching elements
        System.out.println("\n7. Searching for 'Orange':");
        System.out.println("   Found in ArrayList? " + arrayList.contains("Orange"));
        System.out.println("   Found in LinkedList? " + linkedList.contains("Orange"));

        // 8. List size
        System.out.println("\n8. Size of lists:");
        System.out.println("   ArrayList size: " + arrayList.size());
        System.out.println("   LinkedList size: " + linkedList.size());

        // 9. Iterating over list (for-each loop)
        System.out.println("\n9. Iterating using for-each:");
        System.out.print("   ArrayList: ");
        for (String fruit : arrayList) {
            System.out.print(fruit + " ");
        }
        System.out.print("\n   LinkedList: ");
        for (String fruit : linkedList) {
            System.out.print(fruit + " ");
        }

        // 10. Using Iterator
        System.out.println("\n\n10. Iterating using Iterator:");
        Iterator<String> arrayIterator = arrayList.iterator();
        System.out.print("   ArrayList: ");
        while (arrayIterator.hasNext()) {
            System.out.print(arrayIterator.next() + " ");
        }

        Iterator<String> linkedIterator = linkedList.iterator();
        System.out.print("\n   LinkedList: ");
        while (linkedIterator.hasNext()) {
            System.out.print(linkedIterator.next() + " ");
        }

        // 11. Sorting
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("\n\n11. After sorting:");
        System.out.println("   ArrayList: " + arrayList);
        System.out.println("   LinkedList: " + linkedList);

        // 12. Sublist
        List<String> arraySubList = arrayList.subList(1, 3);
        List<String> linkedSubList = linkedList.subList(1, 3);
        System.out.println("\n12. Sublist from index 1 to 3 (exclusive):");
        System.out.println("   ArrayList sublist: " + arraySubList);
        System.out.println("   LinkedList sublist: " + linkedSubList);

        // 13. Clearing the list
        arrayList.clear();
        linkedList.clear();
        System.out.println("\n13. After clearing both lists:");
        System.out.println("   ArrayList: " + arrayList);
        System.out.println("   LinkedList: " + linkedList);
    }
}
