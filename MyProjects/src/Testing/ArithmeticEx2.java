package Testing;

//((((10/2)-2)-2)+2)*2)

public class ArithmeticEx2 
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
		System.out.println("Final Result is  "+x3);
		return x3;
	}
	public int div(int y1, int y2)
	{
		int y3= y1/y2;
		System.out.println("Div result is =  " + y3);
		return y3;
	}
	public static void main(String[] args) 
	{
		ArithmeticEx2 ar= new ArithmeticEx2();
		int div_result= ar.div(10,2);
		int sub_result= ar.sub(div_result, 2);
		int sub2= ar.sub(sub_result, 2);
		int sumresult= ar.sum(sub2, 2);
		ar.mul(sumresult, 2);
		
	}
	

		
		
	}
