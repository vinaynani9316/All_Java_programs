import java.util.*;
 
public class Factorial
{
    public static void main(String args[])
    {
        int num;
        long factorial;
         
        Scanner bf=new Scanner(System.in);
         
        System.out.print("Enter any integer number: ");
        num= bf.nextInt();
         
        factorial=1;                                               //find factorial

        for(int loop=num; loop>=1; loop--)
            factorial*=loop;
         
        System.out.println("Factorial of " + num + " is: " + factorial);
        bf.close();
    }
}
