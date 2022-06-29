package Testing;

public class Variables 
{
	int a, b, c; // Global variables
	
	public void ashish()
	{
	//	int x, y, x ; // Local variables
	}
	 public void test()
	 {
		 int z;
		// x=x+1; // we can not user variable x because its scope is only in method ashish()
		 a=a+1; // we can use variable a in this method because a is global variable
		 System.out.println("checking Local and Global Variable");
	
	 }

}
