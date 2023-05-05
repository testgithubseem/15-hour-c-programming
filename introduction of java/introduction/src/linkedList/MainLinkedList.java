package linkedList;
import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>ll=new LinkedList<>();
		ll.add(12);
		ll.add(2);
		ll.add(32);

		System.out.println(ll);
		System.out.println(ll.get(2));
		//System.out.println(ll.add all(12,2,32));
		ll.set(1, 50);
		System.out.println(ll);

	}

}

