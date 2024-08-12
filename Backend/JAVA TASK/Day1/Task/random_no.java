package FSD_JAVA;
import java.util.Scanner;
public class random_no 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int random=(int)(Math.random()*num);
		System.out.println("Random Number is : "+random);
	}
}
