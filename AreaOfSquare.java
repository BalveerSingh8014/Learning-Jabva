class Square	//.............................................................Parent class.....................
{
	int a,b;
	Square()		//Default constructor
	{
		a = 0;
		b = 0;
	}
	Square(int x,int y)		//Constructor with two parameter
	{
		a = x;
		b = y;
	}
	void area(int a, int b)		//method overiding 
	{
		System.out.println("Area of square(parent class):- " + (a+b));
	}
}

class ChildSquare extends Square   	//........................................................child class.......................................
{
	int b;
	
	void side(int b)
	{
		System.out.println("Side of square is:- " + b);						//taking value from child class 
		System.out.println("Side of square(parent class) is:- " + super.b); 	//taking value from parent class
	}
	
	void area(int a, int b)		//method overiding
	{	
		super.area(a,b);		//call to super method or call to method of parent class
		System.out.println("Area of square(child class):- " + a*b);
	}
}


class AreaOfSquare					//.........................................................Main Class..........................................
{
	public static void main(String[] args)
	{
		ChildSquare s1 = new ChildSquare();			//making objects of child class
		s1.area(5,5);
		s1.side(6);
	}
}