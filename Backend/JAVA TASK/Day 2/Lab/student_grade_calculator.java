package FSD_JAVA;
import java.util.Scanner;

class student{
	int regno;
	String name;
	int a[] = new int [5];
	 
	student(int regno, String name) {
		this.regno=regno;
		this.name=name;
	}
	
	int sum;
	String grade="";
	float avg;
	
	void getmarks() {
		Scanner rd = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=rd.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			sum+=a[i];
			avg=sum/5;
			System.out.println(sum);
			System.out.println(avg);
		}
	}
	void calculate_grade() {
		for(int i=0;i<5;i++)
		{
			sum+=a[i];
			
		}
		avg=sum/5;
		System.out.println(sum);
		System.out.println(avg);
		
		if(avg>=90)
		{
			grade="Grade O";
		}
		else if(avg>=80) {
			grade="Grade A";
		}
		else if(avg>=70) {
			grade="Grade B";
		}
		else if(avg>=60) {
			grade="Grade C";
		}
		else if(avg>=50) {
			grade="Grade D";
		}
		else {
			grade="Failed";
		}
		
	}
	void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Register No: " + regno);
        System.out.println("Average Marks: " + avg);
        System.out.println("Grade: " + grade);

	}
}

public class student_grade_calculator {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.print("Enter student register number: ");
        int regno = s.nextInt();
        s.nextLine(); 
        System.out.print("Enter student name: ");
        String name = s.nextLine();
        student ob = new student(regno, name);
        ob.getmarks();
        ob.calculate_grade();
        ob.display();
	}

}
