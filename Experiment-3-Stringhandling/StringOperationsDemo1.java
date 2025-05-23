/*3a. Develop a java program for performing various string operations with different string
handling functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
startsWith() and endsWith()*/
package StringOperations;

public class StringOperationsDemo1 {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println("Contains 'fox'? " + sentence.contains("fox"));
        System.out.println("Index of 'jumps': " + sentence.indexOf("jumps"));

        // 5. Substring Operations
        System.out.println("Substring (4, 9): " + sentence.substring(4, 9));

        // 6. String Modification
        String modified = sentence.replace("lazy", "active");
        System.out.println("Modified sentence: " + modified);

        // 7. Whitespace Handling
        String withSpaces = "   AIET College   ";
        System.out.println("Trimmed: '" + withSpaces.trim() + "'");

        // 8. String Concatenation
        String full = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + full);

        // 9. String Splitting
        String csv = "Red,Green,Blue,Yellow";
        String[] colors = csv.split(",");
        System.out.println("Colors:");
        for (String color : colors) {
            System.out.println("- " + color);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("AIET");
        sb.append(" Institute");
        System.out.println("StringBuilder Result: " + sb.toString());

        // 11. String Formatting
        String name = "John";
        int age = 21;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted String: " + formatted);

        // 12. Validate Email
        String email = "student@aiet.edu.in";
        boolean isValid = email.contains("@") && email.endsWith(".in") && email.startsWith("student");
        System.out.println("Is email valid? " + isValid);
    }
}
