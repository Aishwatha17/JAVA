package Day_4;

public class Demo8 {
	int x;
	int y;
	public Demo8(int x,int y){
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public Demo8(Demo8 t1) {
		this.x=t1.x;
		this.y=t1.y;
		System.out.println(x-y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo8 t1=new Demo8(45,23);
		Demo8 t2=new Demo8(t1);
		

	}

}
