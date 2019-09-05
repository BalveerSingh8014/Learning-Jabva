import java.util.Scanner;
class fun
{	int k,l,sum,sub,mul,div;
	void add(int k, int l)
	{
		sum = k + l;
		System.out.println(sum);
	}
	void sub(int k, int l)
	{
		sub = k - l;
		System.out.println(sub);
	}
	void mul(int k, int l)
	{
		mul = k * l;
		System.out.println(mul);
	}
	void div(int k, int l)
	{
		div = k / l;
		System.out.println(div);
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
		while(exit != 'n')
		{
			System.out.println("Enter the value of a:- ");
			a = IN1.nextInt();
			System.out.println("Enter the value of b:- ");
			b = IN1.nextInt();
			System.out.println("Enter the operator:- ");
			c = IN1.next().charAt(0);
			switch(c)
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
			while(z != 'y' || z != 'n')
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
				System.out.println("Enter y for YES || Enter n for NO");
			 	z = IN2.next().charAt(0);
			 }
			}
		}
	}
}