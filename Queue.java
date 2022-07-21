/**
 * Lab 03
 * @author Lab Group 7: Meghana Indukuri & Joseph Khamisy
 * This program creates the class Queue which inherits the 
 * singlyLinkedList class. This program implements methods
 * for the Queue FIFO structure. Queue objects do not allow 
 * Linked List functions to be used on them.
 * July 20th 2022
 */
public class Queue extends SinglyLinkedList {

	public Queue()
	{
		super();
	}
	
	public void enqueue(Currency val) 
	{
		super.addCurrency(val, super.countCurrency());
	}
	
	public Currency dequeue()
	{
		Currency val = super.getStart().getData();
		super.removeCurrency(0);
		return val;
	}
	
	public Currency peekFront() 
	{
		return super.getStart().getData();
	}
	
	public Currency peekRear() 
	{
		return super.getEnd().getData();
	}
	
	public String printQueue() 
	{
		return super.printList();
	}
	
	
	
	
	
	
	public LinkNode getStart() 
	{
		throw new UnsupportedOperationException();
	}
	
	public LinkNode getEnd() 
	{
		throw new UnsupportedOperationException();
	}
	
	public int countCurrency()
	{
		throw new UnsupportedOperationException();
	}
	
	public boolean isListEmpty() 
	{
		throw new UnsupportedOperationException();
	}
	
	public void addCurrency(Currency value, int index) 
	{
		throw new UnsupportedOperationException();
	}
	
	
	public void removeCurrency(Currency value)
	{
		throw new UnsupportedOperationException();		
	}
	
	
	public void removeCurrency(int index) 
	{
		throw new UnsupportedOperationException();
	}
	
	public int findCurrency(Currency value) 
	{
		throw new UnsupportedOperationException();
	}
	
	public LinkNode getCurrency(int index) 
	{
		throw new UnsupportedOperationException();
	}
	
	public String printList() 
	{
		throw new UnsupportedOperationException();
	}
	

	
}
