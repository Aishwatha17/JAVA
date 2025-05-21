package NRCM1;
interface Dark{
	void kitkat();
}
interface White{
	void milkbar();
}
class Test11{
	void dairymilk() {
		System.out.println("Dairymilk is sweet");
	}
}

class Test22 extends Test11 implements Dark,White{
	public void kitkat() {
		System.out.println("kitkat is yummy");
	}
	public void milkbar() {
		System.out.println("milkybar is white color");
	}
	public void bournvilla() {
		System.out.println("bournvilla is dark chocolate");
	}
}
class Demo8 extends Test22{
	public void kisses() {
		System.out.println("kisses chocolate");
	}
	
	public static void main(String[] args) {
		Demo8 d1=new Demo8();
		d1.bournvilla();
		d1.kitkat();
		d1.milkbar();
		d1.kisses();
	}
	
	}

