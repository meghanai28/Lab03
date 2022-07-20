import java.nio.BufferUnderflowException;
import java.util.NoSuchElementException;

public class SinglyLinkedList {
	
	private int count;
	private LinkNode start;
	private LinkNode end;
	
	public SinglyLinkedList()
	{
		start = null;
		end = null;
		count = 0;
	}
	
	public LinkNode getStart() 
	{
		if(start == null)
		{
			throw new NoSuchElementException();
		}
		return start;
	}
	
	public LinkNode getEnd() 
	{
		if(end == null)
		{
			throw new NoSuchElementException();
		}
		return end;
	}
	
	public int countCurrency() 
	{
		return count;
	}
	
	public boolean isListEmpty()
	{
		return start == null;
	}
	
	
	public void addCurrency(Currency value, int index) 
	{
		if(value == null)
		{
			throw new IllegalArgumentException();
		}
		if(index<0 && index> count)
		{
			throw new IllegalArgumentException();
		}
		
		LinkNode added = new LinkNode(value);
		if(start == null&& index == 0)
		{
			start = added;
			end = added;
		}
		else if(start!= null && index ==0)
		{
			added.setNext(start);
			start = added;
		}
		else if(index == count)
		{
			end.setNext(added);
			end = added;
		}
		else
		{
			LinkNode prev = null;
			LinkNode curr = start;
			for(int i =0; i<index; i++)
			{
				prev = curr;
				curr = curr.getNext();
			}
			added.setNext(curr);
			prev.setNext(added);
		}
		count++;
		
		
	}
	
	
	
	public void removeCurrency(Currency value) throws Exception 
	{
		if(value == null)
		{
			throw new IllegalArgumentException();
		}
		if( start==null)
		{
			throw new BufferUnderflowException();
		}
		
		LinkNode prev = null;
		LinkNode curr = start;
		
		while(!curr.getData().isEqual(value) && curr.getNext()!= null)
		{
			prev = curr;
			curr = curr.getNext();
		}
		
		if(curr.getData().isEqual(value))
		{
			if(count == 1)
			{
				start = null;
				end = null;
			}
			else if(curr == start)
			{
				start = curr.getNext();
			}
			else
			{
				if(curr== end)
				{
					end = prev;
				}
				prev.setNext(curr.getNext());
				
			}
			count--;
		}
					
	}
	
	
	
	
	public void removeCurrency(int index) 
	{
		if( start==null)
		{
			throw new BufferUnderflowException();
		}
		
		if(index<0 && index>count)
		{
			throw new IllegalArgumentException();
		}
		
		
		LinkNode prev = null;
		LinkNode curr = start;
			
		if(index ==0)
		{	
			if(count == 1)
			{
				start = null;
				end = null;
			}
			else
			{
				curr = curr.getNext();
				start = curr;
			}
		}
		else
		{
			
			for(int i =0; i<index; i++)
			{
				prev = curr;
				curr = curr.getNext();		
			}
			
			if(end == curr)
			{
				end = prev;
			}
			
			prev.setNext(curr.getNext());
		}
		count--;
		
	}
	
	public int findCurrency(Currency value) throws Exception 
	{
		if(value == null)
		{
			throw new IllegalArgumentException();
		}

		LinkNode temp = start;
		int index =0;
		while(temp!=null && !temp.getData().isEqual(value))
		{
			temp = temp.getNext();
			index++;
		}
		if(temp == null)
		{
			return -1;
		}
		return index;
	}
	
	public LinkNode getCurrency(int index) 
	{
		if(index<0 && index> count)
		{
			throw new IllegalArgumentException();
		}
		
		LinkNode temp = start;
		for(int i =0; i<index; i++)
		{
			temp = temp.getNext();
		}
		
		return temp;
	}
	
	
	
	public void printList() 
	{
		LinkNode temp = start;
		while(temp != null)
		{
			System.out.print(temp.getData()+ "	");
			temp = temp.getNext();
		}
	}
	
	
	
	
}
