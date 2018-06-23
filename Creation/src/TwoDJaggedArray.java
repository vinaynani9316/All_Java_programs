import java.util.*;

public class TwoDJaggedArray 
{
	public static void main(String[]args)
	{
		int a[][];
		a=new int[3][];
		a[0]=new int[5];
		a[1]=new int[4];
		a[2]=new int[3];
	    Scanner scan = new Scanner(System.in);
		int i,j;
		for(i=0;  i<=a.length-1; i++)
		{
			for(j=0; j<=a[i].length-1; j++)
			{
				System.out.println("enter an element for "+i+"th row "+j+"th column");
				a[i][j]=scan.nextInt();
				}
		}
		System.out.println();
		for(i=0; i<=a.length-1; i++)
		{
			for(j=0; j<=a[i].length-1; j++)
			{
				System.out.println(a[i][j]+" ");
			}
		}
		System.out.println();
		scan.close();
	}
}
