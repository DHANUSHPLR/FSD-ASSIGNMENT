package FSD_JAVA;
import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int n = rd.nextInt();
        int c=0;
        if (n == 1 || n == 0) {
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i <= n / 2; i++) { 
                if (n % i == 0) {
                    c = 1;
                    break; 
                }
            }
            if (c == 1) {
                System.out.println("Not Prime");
            } else {
                System.out.println("Prime");
            }
        }
    }
}
