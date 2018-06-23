import java.util.Scanner;

public class Xxx 
{
	public static void main(String[] args) 
	{
		int[][] a=
		{
			{ 10, 3, 6 }, { 45, 7, 8 }, { 2, 0, 8 }
		};
		Scanner sc=new Scanner(System.in);
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			if(a[i][j]==a[0][0])
	    System.out.print(a[0][0] + " ");
	    }
		System.out.println();
		sc.close();
	}
	
}

	
	
	


