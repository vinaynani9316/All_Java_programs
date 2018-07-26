import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args) 
	{
		int a,b,choice;
		float result=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number : ");
		a=sc.nextInt();
		System.out.print("Enter second number :");
		b=sc.nextInt();
		System.out.print("\n1: Addition. \n2: Substraction.");
		System.out.print("\n3: multiplication. \n4: division");
		System.out.print("\n5: remainder. \n6: Exit.");
		System.out.print("Enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1: result=(a+b);
		break;
		case 2: result=(a-b);
		break;
		case 3: result=(a*b);
		break;
		case 4: result=(float)((float)a/(float)b);
		break;
		case 5: result=(a%b);
		break;
		default: 
			System.out.println("invalid choice!!!\n");
		}
          if(choice>=1 && choice<=5)
          {
        	  System.out.println("Result is:" +result);
          }
          sc.close();
		
		}
		
}


