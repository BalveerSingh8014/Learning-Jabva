//incomplete
import java.util.Scanner;
class calc
{	
	int a,b,c,add,sub,mul,div;
	 
	void input()
	{
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter the value of a:- ");
		a = sin.nextInt();
		System.out.println("Enter the value of b:- ");
		b = sin.nextInt();
		System.out.println("Value of a is:- " + a);
		
	}
	void calculate()
	{
		add = a + b;
		sub = a - c;
		mul = a * c;
		div = a / c;
		System.out.println("Value of a is:- " + add);
	}
	
	void display()
	{
		System.out.println("Value of a is:- " + a);
		System.out.println("Value of b is:- " + b);
		System.out.println("Addition is:- " + add);
		System.out.println("Addition is:- " + sub);
		System.out.println("Addition is:- " + mul);
		System.out.println("Addition is:- " + div);
	}
}
class calculator
{
	public static void main(String s[])
	{
		
		calc c1 = new calc();
		c1.input();
		c1.calculate();
		c1.display();
	}
}
