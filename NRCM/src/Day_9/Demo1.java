package Day_9;
import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(12);
		l1.add(45);
		l1.add(67);
		List<Integer> l2=new ArrayList<Integer>(l1);//one method
		l2.add(12);
		l2.add(45);
		l2.add(67);
       // l2.addAll(l1);// two method
        //l2.add(null);
		System.out.println(l2);
	}

}
