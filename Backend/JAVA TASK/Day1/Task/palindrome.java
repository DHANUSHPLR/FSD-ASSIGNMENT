package FSD_JAVA;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);
		int n=rd.nextInt();
		int t=n;
		int d=0;
		int s=0;
		while(n!=0)
		{
			d=n%10;
			s=s*10+d;
			n/=10;
			
		}
		if(s==t)
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Not a Palindrome");
		}
	}

}
