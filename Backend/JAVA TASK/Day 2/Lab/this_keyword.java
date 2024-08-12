package FSD_JAVA;

public class this_keyword {

	String name;
	this_keyword(String name){
		this(10, 20);
		this.name=name;
		this.greeting();
	}
	
	this_keyword(int a, int b){
		System.out.println("Addition : "+(a+b));
	}
	
	void greeting() {
		System.out.println("Welcome "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		this_keyword ob= new this_keyword("Raj");
	}

}
