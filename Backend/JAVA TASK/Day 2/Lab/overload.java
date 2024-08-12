package FSD_JAVA;

public class overload {

	overload (String name)
	{
		System.out.println("Welcome "+name);
	}
	overload (int a, int b)
	{
		System.out.println("Sum : "+(a+b));
	}
	overload (int n)
	{
		System.out.println("Sum : "+(n+n));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overload ob1= new overload("Raj");
		overload ob2= new overload(10,20);
		overload ob3= new overload(5);
//		ob.method(5);
//		ob.method("Raj");
//		ob.method(10, 20);
		
		
		
	}

}
