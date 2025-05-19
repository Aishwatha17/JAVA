package Day_2;
import java.util.Scanner;
public class Test16 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a color");
			String color=sc.next();
			switch(color) {
			case "red":
				System.out.println("celebrate holi");
				break;
			case "green":
				System.out.println("celebrate ramzan");
				break;
			case "orange":
				System.out.println("celebrate hanuman jayanthi");
				break;
				default:
					System.out.println("no festival");
				
				
			}
			
				
		}

	}






