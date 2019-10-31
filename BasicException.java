import java.util.Scanner;
class InputValue
{
	Scanner scan = new Scanner(System.in);
	int a,b,c;
	void in()
	{
		System.out.println("Enter the first no:- ");
		a = scan.nextInt();
		System.out.println("Enter the second no:- ");
		b = scan.nextInt();
	}
	void out()
	{
		try
		{
			c = a / b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("============================================================");
			System.out.println("Exception catched:- " + e);
			System.out.println("============================================================");
		}
		System.out.println("Answer is:- " + c);
	}	
}
class BasicException
{
	public static void main(String[] arg)
	{
		InputValue In1 = new InputValue();
		In1.in();
		In1.out();
	}
}