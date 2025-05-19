package Day_1;

public class Test2 {
	int a=90,b=89;
	static int x=45,y=87;
	
	 void not() {
		int p=32,q=65;
		 System.out.println(!(p<q));
	 }
	 public static void main(String[] args) {
		 Test2 t2=new Test2();
		 System.out.println((t2.a<t2.b)&&(t2.a==t2.b));
		 System.out.println((Test2.x>Test2.y)||(Test2.x<=Test2.y));
		 t2.not();
		 
				 
	 }
	 

}
