package Day_7;
class AishwathaException extends Exception{
	public AishwathaException(String message) {
		super(message);
	}
}

public class Demo10 {
	public static void checknum(int num) throws AishwathaException{
	if(num%2==0) {
		throw new AishwathaException("nak maths vachu");
	}else {
		System.out.println("nak maths radhu");
	}

}
	public static void main(String[] args) {
		try {
			checknum(12);
		}catch(AishwathaException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("edhi emaina sare nak maths vachu ");
		}
	}
}



