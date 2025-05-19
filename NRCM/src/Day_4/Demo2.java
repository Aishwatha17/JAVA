package Day_4;

public class Demo2 {
	private String firstName;
	private String lastName;
	
	public void setFirstName(String fn) {
		firstName=fn;
	}
	public void setLastName(String ln) {
		lastName=ln;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d1=new Demo2();
		d1.setFirstName("Aishwatha");
		d1.setLastName("Reddy");
		System.out.println(d1.getFirstName());
		System.out.println(d1.getLastName());
				

	}

}
