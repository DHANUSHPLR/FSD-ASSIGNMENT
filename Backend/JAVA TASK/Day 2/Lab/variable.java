package FSD_JAVA;

public class variable {

	int b=20;
	static int c=30;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		System.out.println("Local Variable : " + a);
		
		variable ob =new variable();
		System.out.println(ob.b);
		
		System.out.println(variable.c);

	}
}
