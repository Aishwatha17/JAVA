package Day_9;
import java.util.*;
public class Demo10 {

	public static void main(String[] args) {
		Set<Integer> s1=new LinkedHashSet<Integer>();
		s1.add(12);
		s1.add(89);
		s1.add(null);
		s1.add(89);
		s1.add(null);
		System.out.println(s1);

	}

}

