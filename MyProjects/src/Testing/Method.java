package Testing;

public class Method {

	public int sum(int a, int b) {
		 int c;
		 c = a+b;
		 System.out.println("sum is "+c);
		 return c;
		 
	}
	public int sub(int x, int y) {
		int z;
		z = x-y;
		System.out.println("result is "+z);
		return z;
	}
	public void multi (int p, int q) {
		int r;
		r = p*q;
		System.out.println("final result "+r);
		
	}
	public static void main(String[] args) {
		Method obj = new Method();
		int sumResult = obj.sum(12,2);
		int subResult = obj.sub(17,10);
		obj.multi(sumResult, subResult);
		
	}
}