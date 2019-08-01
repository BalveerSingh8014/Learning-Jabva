class FirstProgram
{
	public static void main(String s[])
	{
		int a,b;
		a = Integer.parseInt(s[0]);
		b = Integer.parseInt(s[1]);
		System.out.println("Sum of two number is: " + (a + b));
		System.out.println("Subtraction of two number is " + (a-b));
		System.out.println("Devision of two number is "+ (a/b));
		System.out.print("Product of two number is "+ (a*b));
	}
}