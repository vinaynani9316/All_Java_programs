import java.util.*;
public class Three 
  {
	private static Scanner scan;

	public static void main(String[]args)
	{
		int a[][][];
		a=new int[3][4][5];
		scan = new Scanner(System.in);
		int i,j,k;
		for(i=0; i<=a.length-1; i++)
		{
			for(j=0; j<=a[i].length-1; j++)
			{
				for(k=0; k<=a[i][j].length-1; k++)
				{
				System.out.println("enter an element for "+i+" th block "+j+" th row "+k+" th column");
				a[i][j][k]=scan.nextInt();
				
			}
		}
	}
System.out.println();
for(i=0; i<=a.length-1; i++)
{
	for(j=0; j<=a[i].length-1; j++)
	{
		for(k=0; k<=a[i][j].length-1; k++)
		{
			System.out.println(a[i][j][k] +" ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println();
	   }
     }
	}
 