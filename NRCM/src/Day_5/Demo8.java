package Day_5;

public class Demo8 {

		public static void main() {
			System.out.println("Good Morning");
		}
		public static void main(int a,int b) {
			System.out.println(a+b);
		}
		public static void main(double d1,double d2) {
			System.out.println(d1-d2);
		}
		public static void main(String s1,String s2) {
			System.out.println(s1+s2);
		}
		public static void main(String[] args) {
			Demo8 d1=new Demo8();
			main();
			main(34,56);
			main(67.1,43.4);
			main("aishu","reddy");
		}

	}





