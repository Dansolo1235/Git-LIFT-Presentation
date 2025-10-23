/**
 * UtilityLibrary.java
 * 
 * Collaborative Java Project for Git & GitHub
 * Each team member is responsible for implementing one or more methods below.
 * 
 * Instructions:
 * 1. Create a branch named after the method you will implement (e.g., feature-add).
 * 2. Implement only the method assigned to you.
 * 3. Add a simple test print statement in main() to verify your method.
 * 4. Commit, push, and create a Pull Request to merge your branch.
 * 5. Do not modify other members' methods.
 */

public class UtilityLibrary {

    /**
     * Math Methods
     */

    // TODO: Implement this method to return the sum of two integers
    public static int add(int a, int b) {
        // IMPLEMENT YOUR CODE HERE
        return 0;
    }

    // TODO: Implement this method to return the factorial of a non-negative integer
    public static long factorial(int n) {
        // IMPLEMENT YOUR CODE HERE
        return 0;
    }

    /**
     * String Methods
     */

    // TODO: Implement this method to reverse a string
    public static String reverse(String s) {
        // IMPLEMENT YOUR CODE HERE
        return "";
    }

    // TODO: Implement this method to check if a string is a palindrome
    public static boolean isPalindrome(String s) {
        // IMPLEMENT YOUR CODE HERE
        return false;
    }

    /**
     * Array Methods
     */

    // TODO: Implement this method to find the maximum value in an integer array
    public static int maxValue(int[] arr) {
        // IMPLEMENT YOUR CODE HERE
        return 0;
    }

    // TODO: Implement this method to compute the average of a double array
    public static double average(double[] arr) {
        // IMPLEMENT YOUR CODE HERE
        return 0.0;
    }

    /**
     * Utility Methods
     */

    // TODO: Implement this method to generate a random integer between min and max
    public static int getRandomInt(int min, int max) {
        // IMPLEMENT YOUR CODE HERE
        return 0;
    }

    // TODO: Implement this method to print a personalized greeting
    public static void greet(String name) {
        // IMPLEMENT YOUR CODE HERE
    }

    /**
     * Main method to test implemented methods
     */
    public static void main(String[] args) {
        System.out.println("Testing UtilityLibrary methods...");

        // Example test calls (students should add their own test cases)
        System.out.println("Add: " + add(5, 7));
        System.out.println("Factorial: " + factorial(5));
        System.out.println("Reverse: " + reverse("hello"));
        System.out.println("Is Palindrome: " + isPalindrome("madam"));

        int[] numbers = {2, 5, 9, 1};
        System.out.println("Max Value: " + maxValue(numbers));

        double[] decimals = {1.2, 3.4, 5.6};
        System.out.println("Average: " + average(decimals));

        System.out.println("Random Int: " + getRandomInt(1, 10));

        greet("Daniel");
    }
}
