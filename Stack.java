
public class Stack extends SinglyLinkedList {
	
	public Stack()
	{
		super();
	}
	
	public void push(Currency val) throws Exception
	{
		addCurrency(val, 0);
	}
	
	public Currency pop() throws Exception
	{
		Currency val = getStart().getData();
		removeCurrency(0);
		return val;
	}
	
	public Currency peek() throws Exception
	{
		return getStart().getData();
	}
	
	public void printStack()
	{
		printList();
	}
	
	
	
	
}
