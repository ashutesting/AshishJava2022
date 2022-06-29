package Testing;

//((((10+2)+2)-2)*2)/2)
public class ArithmeticExp 
{
	public int sum(int a, int b)
	{
		int c= a+b;
		System.out.println("Sum Result is " + c);
		return c;
	}
	
	public int sub(int x, int y)
	{
		int z= x-y;
		System.out.println("Substraction result is " + z);
		return z;
	}
	
	public int mul(int x1, int x2)
	{
		int x3= x1*x2;
		System.out.println("Multiplication result is  "+x3);
		return x3;
	}
	public void div(int y1, int y2)
	{
		int y3= y1/y2;
		System.out.println("Final result of this expression is =  " + y3);
	}
	
	public static void main(String[] args) 
	{
		ArithmeticExp ar= new ArithmeticExp();
		int sum1= ar.sum(10, 2);
		int sum2= ar.sum(sum1, 2);
		int sub_result= ar.sub(sum2, 2);
		int mul_result= ar.mul(sub_result, 2);
		ar.div(mul_result, 2);
		
	}

}
