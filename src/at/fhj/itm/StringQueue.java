package at.fhj.itm;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Uses Methods to implement a Queue with Sting Objects
 * @author Philipp Glanzer
 *
 */
public class StringQueue implements Queue {
	
	
	//represent the Queue
	private ArrayList<String> queueList;
	
	public StringQueue(ArrayList<String> queueList) {
		// TODO Auto-generated constructor stub
		this.queueList = queueList;
		queueList = new ArrayList<String>();
	}
	
	
	/**
	 * Add a string to the queue
	 * @param obj 
	 * return true if succeeded else return false
	 */
	@Override
	public boolean offer(String obj) {
		
		if(queueList.add(obj))
		{
			return true;
		}
		return false;
	}

	/**
	 * returns the first element in the Queue
	 * if the queue is emtpy return null
	 * else return the String element
	 */
	@Override
	public String poll() {
		
		String element = "";
		
		if(queueList.isEmpty())
		{
			return null;
		}
		element = queueList.remove(queueList.indexOf(queueList) + 1);
		return element;

	}

	/**
	 * removes and returns the first element of the queue if the queue is empty throw NoSuchElementException
	 * else remove and return the element.
	 */
	@Override
	public String remove() {
		String element = "";
		
		if(queueList.isEmpty())
		{
			throw new NoSuchElementException();
		}
		element = queueList.remove(queueList.indexOf(queueList) + 1);
		return element;
	}

	/**
	 * returns and deletes the first element of the queue 
	 * if queue is empty return null
	 * else return the element
	 */
	@Override
	public String peek() {
		String element = "";
		
		if(queueList.isEmpty())
		{
			return null;
		}
		
		element = queueList.get(queueList.indexOf(queueList) + 1);
		return element;
	}
	
	
	/**
	 * returns the first element of the Queue 
	 * if queue is empty throw NoSuchElementException
	 * else return element
	 */
	@Override
	public String element() {
		String element = "";
		
		if(queueList.isEmpty())
		{
			throw new NoSuchElementException();
		}
		
		element = queueList.get(queueList.indexOf(queueList) + 1);
		return element;
	}

}
