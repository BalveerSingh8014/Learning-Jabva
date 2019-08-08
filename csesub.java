class cse
{
	int m1;
	int m2;
	int sub;
	int sum;
	int div;
	int mult;
	void Calculate()
	{
		sum = m1 + m2;
		sub = m1 - m2;	
		div = m1 / m2;
		mult = m1 * m2;
	}
	 void display()
	 {
		 System.out.println("*********************");
		 System.out.println(" ");
		 System.out.println("First number:- " + m1);
		 System.out.println("Second number:- " + m2);
		 System.out.println("Addition is:- " + sum);
		 System.out.println("Subtraction is:- " + sub);
		 System.out.println("Multiplcation is:- " + mult);
		 System.out.println("Division is:- " + div);
		 System.out.println(" ");
		 System.out.println("*********************");
	}
}
class csesub
{
	public static void main(String s[])
	{
		cse s1 = new cse();
		s1.m1=10;
		s1.m2=5;
		s1.Calculate();
		s1.display();
	}
}
