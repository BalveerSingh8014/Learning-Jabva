import java.util.Scanner;

class newCalculator
{
	
	static void display(char x, int k,int l)
	{
		char oper1;
	
		oper1 = x;
		switch(oper1)
		{
			case '+':
			System.out.println(k+l);
			break;
			case '-':
			System.out.println(k-l);
			break;
			case '*':
			System.out.println(k*l);
			break;
			default:
			System.out.println("No operator");
		}
	}	
		
	public static void main(String s[])
	{
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter the first number:-");
		int a = sin.nextInt();
		System.out.println("Enter the second number:-");
		int b = sin.nextInt();
		System.out.println("Enter the operator:-");
		char oper = sin.next().charAt(0);
		display(oper,a,b);	
	
    }
}
