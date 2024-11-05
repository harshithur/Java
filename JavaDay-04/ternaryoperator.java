//The program to find that if the given number is even print 10 if its odd print 20..
//using ternary operator..
public class ternaryoperator{
   public static void main(String[] args){
    int result = 0;
    int i = 10;

   // if(i%2==0)
   //    result = 10;
   // else
   //    result = 20;

   // System.out.println(result);


    // Same program in ternary operator :-

    result = i%2==0 ? 10 : 20;

    System.out.println(result);

  }
}