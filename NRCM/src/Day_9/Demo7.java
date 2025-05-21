package Day_9;
import java.util.*;
public class Demo7 {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(21);
		l1.add(78);
		l1.add(56);
		l1.add(43);
	     System.out.println(l1);
	     l1.addFirst(11);
	     l1.addLast(99);
	     l1.add(3,33);
	     System.out.println(l1);
	     l1.removeFirst();
	     l1.removeLast();
	     l1.removeFirstOccurrence(21);
	     l1.remove(3);
	     System.out.println(l1);
	}
}
