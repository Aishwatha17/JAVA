package Day_4;
class FixedAmount{
	public int fixedamount=10000;
}
abstract class Withdrawal{
	abstract void withdraw(int amount);
}
public class Demo1 extends Withdrawal{
	FixedAmount f1=new FixedAmount();
	
	void withdraw(int amount) {
		f1.fixedamount -= amount;
		System.out.println("Withdrawn: "+ amount);
		System.out.println("Available Balance: "+f1.fixedamount);
	}
		
	public static void main(String[] args) {
		int amount = Integer.parseInt(args[0]);
		Demo1 d=new Demo1();
		d.withdraw(amount);
		
        
	}

}
