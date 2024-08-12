package FSD_JAVA;
import java.util.Scanner;
public class amstong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner (System.in);
		int n=rd.nextInt();
		int t=n;
		int d=0,s=0;
		while(n!=0)
		{
			d=n%10;
			s=s+d*d*d;
			n/=10;
		}
		if(t==s)
		{
			System.out.println("Amstrong");
		}
		else
		{
			System.out.println("Not Amstrong");
		}
	}
}
