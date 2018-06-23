import java.util.Scanner;
public class Floyds 
{
	public static void main(String[] args) 
	{
		int i,j,rows;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows for floyds trangle");
		rows=sc.nextInt();
		int count=1;
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(count+ " ");
				count++;
			}
			System.out.println();
		}
		sc.close();
	}

}
