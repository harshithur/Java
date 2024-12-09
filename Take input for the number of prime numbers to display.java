package javaPractice;
import java.util.Scanner;

public class java_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of prime numbers to display
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println("The first " + n + " prime numbers are:");
        int count = 0; // To count how many prime numbers have been found
        int num = 2;   // Start checking for prime numbers from 2

        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 0 and 1 are not prime numbers
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Number is divisible, not prime
            }
        }
        return true; // Number is prime
    }
}

