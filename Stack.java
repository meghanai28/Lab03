

public class Stack extends SinglyLinkedList {
	
	public Stack()
	{
		super();
	}
	
	public void push(Currency val) 
	{
		super.addCurrency(val, 0);
	}
	
	public Currency pop() 
	{
		Currency val = super.getStart().getData();
		super.removeCurrency(0);
		return val;
	}
	
	public Currency peek() 
	{
		return super.getStart().getData();
	}
	
	public void printStack() 
	{
		super.printList();
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
	
	public void printList() 
	{
		throw new UnsupportedOperationException();
	}
	
	
}
