package Day_1;

public class Test4 {
	int s=6;
	static int r=5,l=7,w=8;
	
	void circle() {
		System.out.println(3.14*r*r);
	}
	  static void rec() {
		System.out.println(w*l);
		}
	 void square() {
		 System.out.println(s*s);
	 }
	  static void triangle() {
		  int b=6,h=9;
		  System.out.println(b*h/2);
	  }
	  public static void main(String[] args) {
		  Test4 t4=new Test4();
		  t4.circle();
		  rec();
		  t4.square();
		  triangle();
		  
		
	  }
	  
	

}
