/**
 * Lab 03
 * @author Lab Group 7: Meghana Indukuri & Joseph Khamisy
 * This program creates the class Stack which inherits the 
 * singlyLinkedList class. This program implements methods
 * for the stack LIFO structure. Stack objects do not allow 
 * Linked List functions to be used on them.
 * July 20th 2022
 */
public class Stack extends SinglyLinkedList {
	
	/**
	 * Default Constructor which calls the super constructor
	 * to initalize a new Stack derived from the singlyLinkedList
	 */
	public Stack()
	{
		super();
	}
	
	/**
	 * Pushes a given currency value onto the stack
	 * @pre Currency val must not be null or exception is thrown from
	 * 		super addCurrency method.
	 * @post Exception is thrown when val is null or when the stack is full
	 */
	public void push(Currency val) 
	{
		super.addCurrency(val, 0);
	}
	
	/**
	 * Pops the head node off the stack 
	 * @pre 
	 * @post Exception is thrown when stack is empty
	 * and the method pop is called.
	 * @return Currency val - the val that was popped off the stack
	 */
	public Currency pop() 
	{
		return super.removeCurrency(0);
	}
	
	/**
	 * Returns the value at the top of the stack without
	 * modifying the stack in any way.
	 * @pre
	 * @post Throws an exception when the stack is empty and
	 * peek method is called.
	 * @return the Currency value that was at the top of the stack.
	 */
	public Currency peek() 
	{
		return super.getStart().getData();
	}
	
	/**
	 * Returns a string signifying the contents of the 
	 * stack from the top to bottom, spaced by a tab.(LIFO)
	 * @pre
	 * @post
	 * @return The string with the stack nodes from top 
	 * to bottom.
	 */
	public String printStack() 
	{
		return super.printList();
	}
	

	
	
	
	
	
	/**
	 * @override
	 * This method throws an unsupportedOperationException
	 * whenever it is called on a stack object.
	 * @pre
	 * @post throws an exception
	 * 
	 */
	public LinkNode getStart()
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * @override
	 * This method throws an unsupportedOperationException
	 * whenever it is called on a stack object.
	 * @pre
	 * @post throws an exception
	 * 
	 */
	public LinkNode getEnd() 
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * @override
	 * This method throws an unsupportedOperationException
	 * whenever it is called on a stack object.
	 * @pre
	 * @post throws an exception
	 * 
	 */
	public int countCurrency() 
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * @override
	 * This method throws an unsupportedOperationException
	 * whenever it is called on a stack object.
	 * @pre
	 * @post throws an exception
	 * 
	 */
	public boolean isListEmpty()
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * @override
	 * This method throws an unsupportedOperationException
	 * whenever it is called on a stack object.
	 * @pre
	 * @post throws an exception
	 * 
	 */
	public void addCurrency(Currency value, int index) 
	{
		throw new UnsupportedOperationException();
		
		
	}
	
	/**
	 * @override
	 * This method throws an unsupportedOperationException
	 * whenever it is called on a stack object.
	 * @pre
	 * @post throws an exception
	 * 
	 */
	public Currency removeCurrency(Currency value) 
	{
		throw new UnsupportedOperationException();
					
	}
	
	/**
	 * @override
	 * This method throws an unsupportedOperationException
	 * whenever it is called on a stack object.
	 * @pre
	 * @post throws an exception
	 * 
	 */
	public Currency removeCurrency(int index) 
	{
		throw new UnsupportedOperationException();
		
	}
	
	/**
	 * @override
	 * This method throws an unsupportedOperationException
	 * whenever it is called on a stack object.
	 * @pre
	 * @post throws an exception
	 * 
	 */
	public int findCurrency(Currency value) 
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * @override
	 * This method throws an unsupportedOperationException
	 * whenever it is called on a stack object.
	 * @pre
	 * @post throws an exception
	 * 
	 */
	public Currency getCurrency(int index) 
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * @override
	 * This method throws an unsupportedOperationException
	 * whenever it is called on a stack object.
	 * @pre
	 * @post throws an exception
	 * 
	 */
	public String printList() 
	{
		throw new UnsupportedOperationException();
	}
	
	
	
	
}
