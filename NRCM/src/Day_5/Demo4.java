package Day_5;
class Movies{
	void genre () {
		System.out.println("crime and thriller");
	}
}
class Hit extends Movies{
	void action() {
		System.out.println("Investigation");
	}
}
class Hero extends Hit{
	void name() {
		System.out.println("Nani");
	}
}
class Heroine extends Hit{
	void look() {
		System.out.println("excellent");
	}
}
public class Demo4 {
	public static void main(String[] args) {
		Hero h1=new Hero();
		Heroine a1=new Heroine();
		h1.genre();
		h1.action();
		h1.name();
		a1.look();
		//a1.action();
		//a1.genre();           //hybrid class
		
	}

}
