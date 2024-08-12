package FSD_JAVA;

public class method {

	
	void mymethod() {
		System.out.println("Instance Method");
	}
	
	static void myMethod2() {
		System.out.println("Static Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method ob=new method();
		ob.mymethod();
		
		method.myMethod2();
	}

}
