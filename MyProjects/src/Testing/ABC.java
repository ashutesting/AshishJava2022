package Testing;

public class ABC 
{
	public ABC() 
	{
		System.out.println("This is Default Constructor");
	}
	public ABC(int a)
	{
		System.out.println("This is One Parameterized constructor");
	}
	public ABC(int a, int b)
	{
		System.out.println("This is two parameterized Constructor");
	}
	public static void main(String[] args) 
	{
		ABC obj= new ABC();
		ABC obj1= new ABC(10);
		ABC obj2= new ABC(4,10);
	}

}
