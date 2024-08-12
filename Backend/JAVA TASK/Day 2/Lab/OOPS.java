package FSD_JAVA;

class employee{
	int eid;
	String ename;
	float esalary;
	
	employee(int eid, String ename, float esalary)
	{
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
	}
	
	void display() {
		System.out.println("Employee ID : "+eid);
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee Salary : "+esalary);
	}
}

public class OOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee d=new employee(001,"Raj",2000.0f);
		d.display();
		
	}

}
