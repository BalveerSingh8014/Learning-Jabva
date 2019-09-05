import java.util.Scanner;
class fun									//defining function like add,sub,mul,div
{	int k,l,sum,sub,mul,div;
	void add(int k, int l)
	{
		sum = k + l;
		System.out.println("Sum is:- " + sum);
	}
	void sub(int k, int l)
	{
		sub = k - l;
		System.out.println("Subraction is:- " + sub);
	}
	void mul(int k, int l)
	{
		mul = k * l;
		System.out.println("Multiplcation is:- " + mul);
	}	
	void div(int k, int l)
	{
		div = k / l;
		System.out.println("Division is:- " + div);
	}
}

class FunCal
{	static int a, b, c;

	static char oper,exit,z;
	public static void main(String s[])
	{
		Scanner IN1 = new Scanner(System.in);
		Scanner IN2 = new Scanner(System.in);
		fun f1 = new fun();		
		while(exit != 'n')								// loop for asking again & again 
		{
			
			try
			{
				System.out.println("Enter the value of a:- ");
				a = IN1.nextInt();			//Input first number
				System.out.println("Enter the value of b:- ");
				b = IN1.nextInt();			//Input second number
			}
			catch(InputMismatchException e)
			{
				System.out.println("Invalid input.");
			}
			
			System.out.println("Enter the operator:- ");
			c = IN1.next().charAt(0);					//Operator input(+,-,*,/)
			switch(c) //operator choice
			{
				case '+':
				f1.add(a,b);
				break;
				case '-':
				f1.sub(a,b);
				break;
				case '*':
				f1.mul(a,b);
				break;
				case '/':
				f1.div(a,b);
				break;

				default:
				System.out.println("Invalid Operator");	
			}	
			System.out.println("Do you want to continue?y/n");
			z = IN2.next().charAt(0);
			while((z != 'y') || (z != 'n'))				//loop to avoid the invalid input of Yes and No
			{
			  switch(z)
			 {
				case 'y':
				exit = z;
				break;
				case 'n':
				exit = z;
				break;
				default:
				System.out.println("Invalid");
			 	z = IN2.next().charAt(0);
			 }
			}

		}
	}
}