package at.fhj.itm;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<String> queueList = new ArrayList<String>();
		
		StringQueue sq = new StringQueue(queueList);

		//sq.remove();
		
		sq.offer("Hello");
		System.out.println("Element an der 1sten Stelle: " + sq.peek());
		sq.offer("Hello2");
		sq.offer("Hello3");
			
		System.out.println(sq.poll());	
		System.out.println(sq.poll());	
		System.out.println(sq.peek());
		System.out.println(sq.element());
	}

}
