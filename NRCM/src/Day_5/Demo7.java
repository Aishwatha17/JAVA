package Day_5;

public class Demo7 {

		void show() {
			System.out.println("Good Morning");
		}
		void show(int a,int b) {
			System.out.println(a+b);
		}
		void add(double d1,double d2) {
			System.out.println(d1-d2);
		}
		void show(String s1,String s2) {
			System.out.println(s1+s2);
		}
		public static void main(String[] args) {
			Demo7 d1=new Demo7();
			d1.show();
			d1.show(34,56);
			d1.show(67,43);
			d1.show("aishu","reddy");
		}

	}


