package FSD_JAVA;
import java.util.Scanner;
public class fibbnocci 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);
		int a=0,b=1;
		int n=rd.nextInt();
		System.out.print(a+" "+b);
		int t=0;
		for(int i=2;i<n;i++)
		{
			t=a+b;
			System.out.print(" " +t);
			a=b;
			b=t;
		}
	}

}
