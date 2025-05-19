package Day_1;

public class Test1 {
	 int x=67,y=89;//instance variables
	 static int p=45,q=12;//static
	 void div() {
		 int a=90,b=34;//local
	    System.out.println(a/b);
	 }
	 void mul() {
		 System.out.println(p*q);
	 }
	 void mod() {
		 System.out.println(x%y);
	 }
	 public static void main(String[] args) {
		 Test1 t1=new Test1();
		 t1.mul();
		 t1.mod();
		 t1.div();
	 }
	 
}
