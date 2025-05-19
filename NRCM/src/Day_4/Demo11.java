package Day_4;
class Test1{
	 void add() {
		System.out.println("hi");
	}
	
}
public class Demo11 extends Test1 {
	

	public static void main(String[] args) {
		Demo11 d1=new Demo11();
		d1.add();//we are trying to access private access that's we are not getting the output
		
	}

}
