package Day_4;

public class Demo6 {
	int a=89;
	public void add() {
		System.out.println("add");
	}
	public void sub() {
		this.add();
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Demo6 d1=new Demo6();
          d1.sub();
	}

}
