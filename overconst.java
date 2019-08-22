class newconst
{
	int a,b,c;
	newconst()
	{
		System.out.println("Simple Constructor");
	}
	newconst(int x)
	{	
		a = x;
		System.out.println("Constructor with one value");
	}
	newconst(int x, int y)
	{	
		a = x;
		b = y;
		System.out.println("Constructor with two values");
	}
	newconst(newconst x)
	{
		System.out.println("Constructor pass by reference of c3");
	}
}
class overconst
{
	public static void main(String s[])
	{
		newconst c1 = new newconst();
		newconst c2 = new newconst(6);
		newconst c3 = new newconst(6,7);
		newconst c4 = new newconst(c3);
	}
}