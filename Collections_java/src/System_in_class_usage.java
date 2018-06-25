import java.util.Scanner;
public class System_in_class_usage 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int temp=sc.nextInt();
		temp=10;
		System.out.println(temp);
		System.err.println(temp);
		sc.close();
	}

}
