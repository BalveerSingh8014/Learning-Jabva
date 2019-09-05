class Outer
{int a= 5;
	void test()
	{
		System.out.println("Inside Outer class Function." + a);
		class Inner
		{
			void display()
			{
				System.out.println("Class inside Outer class member function." + a);
			}
		}
		Inner i1 = new Inner();
		i1.display();
	
	} 
}
class ClassInFun
{
	public static void main(String s[])
	{
		System.out.println("Inside Main Class");
		Outer o1 = new Outer();
		o1.test(); 
		o1.a = 8;
		o1.test();
	}
}