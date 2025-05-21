package Day_7;
import java.util.*;
public class Demo5{
	void add(int a,int b) throws ArithmeticException,InputMismatchException{
		Scanner sc=new Scanner(System.in);
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args){
		Demo5 d1=new Demo5();
		d1.add(10,20);
		
	}
	
}

