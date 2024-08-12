package FSD_JAVA;
import java.util.Scanner;
public class Day_1 {

	public static void main(String[] args) {
			System.out.println("Welcome To Java Program");
			Scanner rd = new Scanner(System.in);
			System.out.println("Employee ID");
			int eid = rd.nextInt();
			System.out.println("Employee Name : ");
			String n = rd.next();
	
			System.out.println("Employee Salary");
			float s=rd.nextFloat();
			System.out.println("Employee ID : "+ eid);
			System.out.println("Employee Name : "+ n);
			System.out.println("Employee Salary : "+ s);
	}

}
