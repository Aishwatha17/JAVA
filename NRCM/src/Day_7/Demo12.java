package Day_7;
import java.util.*;
public class Demo12 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		try{
			System.out.println("enter the class name");
			String className=s1.next();
			Class.forName(className);
			System.out.println("the class found");
		}catch(ClassNotFoundException e) {
			System.out.println("class not found :"+e.getMessage());
		}finally {
			s1.close();
		}
	}

}
