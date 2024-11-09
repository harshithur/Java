
import java.util.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();  // Read number of test cases
        
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();  // First term
            int b = in.nextInt();  // Multiplier
            int n = in.nextInt();  // Number of terms
            
            int currentTerm = a;  // Initialize the first term
            for (int j = 0; j < n; j++) {
                currentTerm += b * (1 << j);  // Add b * 2^j to the current term
                System.out.print(currentTerm + " ");
            }
            System.out.println();  // Move to the next line after printing each series
        }
        in.close();
    }
} 