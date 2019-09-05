class Outer
{
	int a;
	void test()
	{
		Inner i1 = new Inner();
		System.out.println("You are inside Outer class.");
		i1.display();
		
	}
	class Inner
	{
		void display()
		{
			System.out.println("You are inside Inner class.");
		}
	}

}
class MainClass
{
	public static void main(String s[])
	{
		Outer o1 = new Outer();
		o1.test();
		
	}
}