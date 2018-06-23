package info;
import java.util.*;
public class ArrayBoundries {
	public static void main(String[]args)
	{
		int a[];
		a=new int[5];
		Scanner sc=new Scanner(System.in);
		int i;
		for(i=0; i<=4; i++)
		{
			System.out.println("enter an element");
			a[i]=sc.nextInt();
			for(i=0; i<=5; i++)
			{
				System.out.println(a[i]+"");
			}
		}
		sc.close();
	}
	

}
