/*2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better*/

package StringPerformance;

public class StringPerformanceTest {
    public static void main(String[] args) {
        int iterations = 10000;
        String appendText = "AIET";

        // StringBuffer Test (Thread-safe)
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(appendText);
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ns");

        // StringBuilder Test (Non-thread-safe, faster)
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(appendText);
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");

        // Conclusion
        if (durationBuilder < durationBuffer) {
            System.out.println("\n StringBuilder is faster for single-threaded operations.");
        } else {
            System.out.println("\n StringBuffer is safer for multi-threaded scenarios, but slower.");
        }
    }
}


