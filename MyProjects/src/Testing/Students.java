package Testing;

public class Students 
{
	int Age;
	int roll_number;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	public void display2()
	{
		System.out.println("Automation is very easy and definately I will work on it");
	}
	
	public static void main(String[] args) 
	{
		Students s= new Students();
		s.display1();
		s.display2();
		s.Age=30;
		s.roll_number=1111;
		System.out.println("Age of the Student is " + s.Age);
		System.out.println("Roll number of the student is " +s.roll_number);	
	}

}
