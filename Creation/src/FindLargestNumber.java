import java.util.*;
 
public class FindLargestNumber{
     
    static int findLargest(int a,int b, int c)     //method to find largest number among three numbers.
    {
        if( a>b && a> c)
            return a;
        else if(b>a && b>c)
            return b;
        else
            return c;
    }
     public static void main(String []args)
     {
            int a=0,b=0,c=0;
            Scanner X = new Scanner(System.in);
             
            System.out.print("Enter First No. :");
            a = X.nextInt();
             
            System.out.print("Enter Second No. :");
            b = X.nextInt(); 
             
            System.out.print("Enter Third No. :");
            c = X.nextInt(); 
             
            System.out.println("Lagest Number is : "+findLargest(a,b,c));
       
     }
}
