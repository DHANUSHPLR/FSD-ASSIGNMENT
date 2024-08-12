package FSD_JAVA;
import java.util.Scanner;
public class factorial 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);
		int n=rd.nextInt();
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println(f);
	}

}
