package Testing;

/*Assignment-
three parameterized constructor
default constructor
one parameterized consturctor
two parameterized constructor
four parameterized consturcott
*/
public class Construct1 
{
	public Construct1()
	{
		this(2,4,2);
		System.out.println("Default Constructor");
	}
	public Construct1(int a)
	{
		this();
		System.out.println("One parameterized constructor");
	}
	public Construct1(int a, int b)
	{
		this(19);
		System.out.println("Two parameterized constructor");
	}
	public Construct1(int a, int b, int c)
	{
		System.out.println("Three parameterized construtor");
	}
	public Construct1(int a, int b, int c, int d)
	{
		this(10,20);
		System.out.println("Four parameterized constructor");
	}
	
	public static void main(String[] args) 
	{
		Construct1 x= new Construct1(10,20,30,40);
		
	}

}
