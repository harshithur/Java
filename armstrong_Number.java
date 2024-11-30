/*What is the Armstrong Number? An Armstrong number is a special kind of number in math. It's a number that equals the sum of its digits, each raised to a power*/
package javaProject;
import java.util.Scanner;
public class amstronNumber {

	public static void main(String[] args) {  //Main method in java....
		Scanner sc = new Scanner(System.in);  //Taking input from user... 
		int num    = sc.nextInt();            //Taking integer value..
		int temp = num;
		int originalNum = num;
		//Finding number of digits in the given number 
		//It can be achieved by dividing given number%10 and number /10
		int count = 0;
		while(num > 0) { //Entry to while loop.....
			  int digits = num % 10;
			  num = num / 10;
			  count++;
		}
        //System.out.println("Number of digits in given number is : "+count);
        //Extracting all digits from number.......
        
		int sum = 0;
        while(temp > 0) {
        	int power = 1;
        	
        	int digit = temp % 10;            //Outer looping statement starts....
        	for (int i = 1; i <= count;i++) { //Inner looping statement starts....
        		power = power * digit;
        		//System.out.println("loop"+power);
        	}
        	sum += power;              //Adding Every power + Sum ... 
        	temp = temp / 10;          //Removing last digit from the given number.....
        	
        }
        if (originalNum==sum) {        //if loop for condition true or false.....
        	System.out.println(originalNum+" is amstrong Number");
        } else {
        	System.out.println(originalNum+" is not an amstrong Number");
        }
	}

}
