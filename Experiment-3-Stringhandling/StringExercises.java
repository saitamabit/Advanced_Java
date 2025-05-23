/*3b. String Exercise progams
Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().
Q2. Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()
Q3. Write a Java Program for Reversing the characters in a string using user defined function
reverseString().
Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome():
Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()
3c. String Exercise progams
Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()
Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()
Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()
Q9. Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()
Q10. Write a Java Program for Counting the number of words in a string using user defined function
countWords()
*/

package StringExcercise;

import java.util.Random;

public class StringExercises {

    // Q1: Check if string is null or empty
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    // Q2: Count how many times a substring appears
    public static int countOccurrences(String main, String sub) {
        int count = 0, index = 0;
        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    // Q3: Reverse a string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Q4: Check if string is a palindrome (ignoring case and punctuation)
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return str.equals(reverseString(str));
    }

    // Q5: Remove whitespace
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    // Q6: Capitalize first letter of each word
    public static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase()).append(" ");
            }
        }
        return result.toString().trim();
    }

    // Q7: Truncate string and add ellipsis
    public static String truncate(String str, int length) {
        return str.length() <= length ? str : str.substring(0, length) + "...";
    }

    // Q8: Check if string is numeric
    public static boolean isNumeric(String str) {
        return str != null && str.matches("\\d+");
    }

    // Q9: Generate random string
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            result.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return result.toString();
    }

    // Q10: Count number of words
    public static int countWords(String str) {
        if (isNullOrEmpty(str)) return 0;
        return str.trim().split("\\s+").length;
    }

    // Test driver
    public static void main(String[] args) {
        System.out.println("Q1: isNullOrEmpty: " + isNullOrEmpty("   "));
        System.out.println("Q2: countOccurrences: " + countOccurrences("ababab", "ab"));
        System.out.println("Q3: reverseString: " + reverseString("AIET"));
        System.out.println("Q4: isPalindrome: " + isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("Q5: removeWhitespace: " + removeWhitespace(" AIET College "));
        System.out.println("Q6: capitalizeWords: " + capitalizeWords("alva's institute of engineering"));
        System.out.println("Q7: truncate: " + truncate("This is a long sentence", 10));
        System.out.println("Q8: isNumeric: " + isNumeric("12345"));
        System.out.println("Q9: generateRandomString: " + generateRandomString(8));
        System.out.println("Q10: countWords: " + countWords("Welcome to AIET College"));
    }
}

