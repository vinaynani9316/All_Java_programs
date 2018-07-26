import java.util.Scanner;

class DecimalToBinaryConversionClass
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Any Decimal Number :");
		
		int input_decimal_num = sc.nextInt();

		String binary_string = " ";

		while(input_decimal_num > 0)                                     //Loop continues till input_decimal_num >0
		{
		    binary_string = input_decimal_num%2 + binary_string;         //remainder add to string variable 
			input_decimal_num = input_decimal_num/2;
		}
		System.out.println("Conversion of decimal to binary is : " + binary_string);
		sc.close();
	}
}