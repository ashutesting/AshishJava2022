package Testing;

//Arithmetic Operation = (10+2)(10-2)
public class ArithmeticOps 
{
	public int sum(int a, int b)
	{
		int c= a+b;
		return c;
	}
	public int sub(int a, int b)
	{
		int c= a-b;
		return c;
	}
	
	public void mul (int a, int b)
	{
		int c= a*b;
		System.out.println("Final Result is ="+ c);
	}
	
	public static void main(String[] args) 
	{
		ArithmeticOps x= new ArithmeticOps();
		int sum_result= x.sum(10, 2);
		int sub_result= x.sub(10, 2);
		x.mul(sum_result, sub_result);
		
	}

}
