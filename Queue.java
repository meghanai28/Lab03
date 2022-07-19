
public class Queue extends SinglyLinkedList {

	public Queue()
	{
		super();
	}
	
	public void enqueue(Currency val) throws Exception
	{
		addCurrency(val, countCurrency());
	}
	
	public Currency dequeue() throws Exception
	{
		Currency val = getStart().getData();
		removeCurrency(0);
		return val;
	}
	
	public Currency peekFront() throws Exception
	{
		return getStart().getData();
	}
	
	public Currency peekRear() throws Exception
	{
		return getEnd().getData();
	}
	
	public void printQueue()
	{
		printList();
	}
	
}
