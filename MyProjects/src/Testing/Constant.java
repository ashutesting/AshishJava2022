package Testing;

public class Constant 
{
	final int x= 123;
	public void m1()
	{
		//x= x+1; //can not change
	}
	public static void main(String[] args) 
	{
		Constant obj= new Constant();
		//obj.x= 150; // it can't change
		
	}

}
