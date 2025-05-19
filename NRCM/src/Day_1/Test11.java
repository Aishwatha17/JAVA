package Day_1;

public class Test11 {
	int x=67,y=89;//instance
	static int p=45,q=12;//static
	
	 void div() {
		 int a=90,b=34;
		 System.out.println(a/b);
	 }
	 public static void main(String[] args) {
		 Test11 t11=new Test11();
				 System.out.println(t11.x%t11.y);
		         System.out.println(Test11.p*Test11.q);
		         t11.div();
	 }

}
