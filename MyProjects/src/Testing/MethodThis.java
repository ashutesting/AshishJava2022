package Testing;

public class MethodThis 
{
	public void m1()
	{
		this.m2();
		System.out.println("First method");
		this.m2(); //can use multiple this and first statement is not mandatory
	}
	public void m2()
	{
		System.out.println("Secod method");
	}
	public static void main(String[] args) 
	{
		MethodThis m= new MethodThis();
		m.m1();
		
	}

}
