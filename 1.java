import java.util.Scanner;

public class Fibonacci {
    
    // Iterative method to calculate Fibonacci number
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        
        int a = 0, b = 1, result = 0;
        for (int i = 2; i <= n; i++) {
            result = a + b; // Calculate the next Fibonacci number
            a = b;          // Move to the next pair
            b = result;
        }
        return result;
    }
    
    // Recursive method to calculate Fibonacci number
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2); // Recursive calls
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        // Calling the iterative approach
        System.out.println("Fibonacci Iterative (" + n + "): " + fibonacciIterative(n));
        
        // Calling the recursive approach
        System.out.println("Fibonacci Recursive (" + n + "): " + fibonacciRecursive(n));
        
        scanner.close();
    }
}

//Iterative
//Calculates Fibonacci numbers using a loop, avoiding repeated calculations.
//Time Complexity: O(n),  Space Complexity: O(1)).

//Recursive
//Uses recursion to compute Fibonacci numbers.
//Time Complexity:O(2^n), Space Complexity:O(n).
