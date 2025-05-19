package Day_4;

public class Demo10 {
	int x;
	int y;
	int z;
	public Demo10() {
		System.out.println("Welcome to my profile: Aishwatha");
	}
	public Demo10(int x) {
		this.x=x;
		System.out.println("SCC:"+(x));
	}
	public Demo10(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("SCC:"+(x) + " INTER:"+(y));
	}
	public Demo10(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println("SCC:"+(x) + " INTER:" +(y) + " BTECH:"+(z));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo10 d1=new Demo10();
		Demo10 d2=new Demo10(100);
		Demo10 d3=new Demo10(100,932);
		Demo10 d4=new Demo10(100,932,808);
		
		

	}

}
