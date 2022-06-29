package Testing;

public class thisAssignment 
{
	public void m1()
	{
		System.out.println("Default Method");
		this.m2(10);
		this.m3(10, 20);
	}
	public void m2(int a)
	{
		System.out.println("One Parameterized method");
	}
	public void m3(int a, int b)
	{
		System.out.println("Two parameterized method");
		this.m5(10, 2, 4, 22);
		
	}
	public void m4(int a, int b, int c)
	{
		System.out.println("Three Parameterized method");
		this.m1();
	}
	public void m5(int a, int b, int c, int d)
	{
		System.out.println("Four parameterized methid");
	}
	public static void main(String[] args) 
	{
		thisAssignment x= new thisAssignment();
		x.m4(10, 2, 22);
		
	}
	

}
