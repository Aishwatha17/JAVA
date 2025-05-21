package Day_9;

import java.util.ArrayList;
import java.util.*;
public class Demo2 {

	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object>();//three method
		l1.add(12);
		l1.add("hi");
		l1.add(45);
		l1.add(67);
		List<Object> l2=new ArrayList<Object>();
		l2.add(12);
		l2.add(45);
		l2.add(67);
		l2.add("hello");
        l2.addAll(l1);
        l2.add(null);
		System.out.println(l2);
	}

}

