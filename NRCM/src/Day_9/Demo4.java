package Day_9;
import java.util.*;
public class Demo4 {

	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object>();
		l1.add(12);
		l1.add("hi");
		l1.add(67);
		l1.add(2,"hello");
		System.out.println(l1);
		List<Object> extra=Arrays.asList("aishu","mummy","daddy");
		l1.addAll(1,extra);
		System.out.println(l1);//(l1.get(0));//particular index value
		System.out.println(l1.indexOf("hello"));
		
		
		
	}

}
