package Day_2;

public class Test6 {
	public static void main(String[] args) {
		int a=11;
		if(a%2==0) {
			if(a>=10) {
				System.out.println("divisable by 2 and greater than are equal to 10");
			}
		}
		else {
			if(a%3==0) {
				if(a>=10) {
					System.out.println("divisable by 3 and greater than are equalto 10");
				}
				else {
					System.out.println("not divisable by 3 and greater than are equalto 10");
					
				}
			}
			else {
				if(a>10) {
					System.out.println("a is greater than 10");
				}
			}
		}
	}

}
