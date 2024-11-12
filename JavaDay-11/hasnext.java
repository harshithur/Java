import java.util.*;

public class hasnext {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String myObj =
        // while(myObj.hasNext()) {
        // System.out.println(myObj.next());
        // }
        // Create a scanner object
        Scanner myObj = new Scanner("A string to scan");

        // Read every token
        while (myObj.hasNext()) {
            for (int i = 1; i <= 4; i++) {
                System.out.println(i+" "+ myObj.next());
            }
        }
    }
}
