package FSD_JAVA;
import java.util.Scanner;
public class ASCII {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Starting Character :");
		char ch=s.next().charAt(0);
		System.out.println("Enter the Ending Character :");
		char ch1=s.next().charAt(0);
		for(int i=(int)ch;i<=(int)ch1;i++)
		{
			System.out.println(i);
		}
	}
}
