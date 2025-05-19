package Day_4;

public class Demo7 {
	int a=30;
	int b=40;
	public Demo7(int x,int y) {
	   a=x;
	   b=y;
	   System.out.println(x+y);
	}
	public void add() {
		System.out.println(this.a-this.b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo7 d1=new Demo7(78,34);
		d1.add();

	}

}
