/*2 a. Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith() */

package stringexample;

public class StringOperationsDemo {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("Original Strings: str1 = " + str1 + ", str2 = " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("str1 equals str3 (case-sensitive): " + str1.equals(str3));
        System.out.println("str1 equals str3 (case-insensitive): " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        String sentence = "Welcome to Java Programming!";
        System.out.println("Index of 'Java' in sentence: " + sentence.indexOf("Java"));
        System.out.println("Does sentence contain 'Python'? " + sentence.contains("Python"));

        // 5. Substring Operations
        String sub = sentence.substring(11, 15); // "Java"
        System.out.println("Substring (11 to 15): " + sub);

        // 6. String Modification
        String replaced = sentence.replace("Java", "Python");
        System.out.println("After replace: " + replaced);
        System.out.println("To upper case: " + str1.toUpperCase());
        System.out.println("To lower case: " + str2.toLowerCase());

        // 7. Whitespace Handling
        String strWithSpaces = "  Hello Java  ";
        System.out.println("Original with spaces: '" + strWithSpaces + "'");
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");

        // 8. String Concatenation
        String concat = str1 + " " + str2;
        System.out.println("Concatenated String: " + concat);

        // 9. String Splitting
        String csv = "Red,Green,Blue";
        String[] colors = csv.split(",");
        System.out.println("Split colors:");
        for (String color : colors) {
            System.out.println(color);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Welcome");
        sb.append(" to Java");
        sb.insert(0, "Hey! ");
        sb.replace(4, 7, "Hello");
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        int age = 21;
        String name = "Alice";
        System.out.println(String.format("Name: %s, Age: %d", name, age));

        // 12. Email Validation with contains(), startsWith(), endsWith()
        String email = "student@example.com";
        boolean isValid = email.contains("@") && email.startsWith("student") && email.endsWith(".com");
        System.out.println("Is '" + email + "' a valid email? " + isValid);
    }
}
