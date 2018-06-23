import java.util.*;
@SuppressWarnings("serial")
class Negative_balance_exception extends Exception
{
	public String get_message()
	{
		return "your are a fool entered amount is -ve";
	}
}
@SuppressWarnings("serial")
class minimum_balance_exception extends Exception
{
	public String get_message()
	{
		return "your even more fool enter amount is less than balance";
	}
}
class Bank
{
	int amt,bal;
	Bank(int x)
	{
		bal=x;
	}
	void input()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount to be with drawn");
		amt=sc.nextInt();
	}
	void dispatch_amount()
	{ 
		try
		{
		if(amt<=0)
		{
			throw new Negative_balance_exception();
		}
		else if(amt>bal)
		{
			throw new minimum_balance_exception();
		}
		else
		{
			bal=bal-amt;
			System.out.println("collect your money");
		}
		}
		catch(Negative_balance_exception e)
		{
			System.out.println(e.get_message());
		}
		catch( minimum_balance_exception e)
		{
			System.out.println(e.get_message());
		}
	}
}
public class Bank_app 
{
	public static void main(String[] args) 
	{
		Bank b=new Bank(10000);
		b.input();
		b.dispatch_amount();
	}

}
