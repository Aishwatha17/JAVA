package Day_9;
import java.util.*;
public class Demo13 {

	public static void main(String[] args) {
		Map<Integer,String> m1=new LinkedHashMap<Integer,String>();
		m1.put(3, "cse");
		m1.put(7, "ece");
		m1.put(4, "civil");
		m1.put(6, "ds");
		m1.put(1, "aiml");
		m1.put(2, "cs");
		m1.put(5, "eee");
		System.out.println(m1);
		for(Map.Entry<Integer,String>i:m1.entrySet()) {
		System.out.println(i.getValue());
		System.out.println(i.getKey());
		}
	}
}

