package Day_7;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Demo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b values");
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException | InputMismatchException e) {
			System.out.println(e.getMessage());
		
		}	
	}

}

