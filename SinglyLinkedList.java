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
	
	public LinkNode getStart() throws Exception
	{
		if(start == null)
		{
			throw new Exception();
		}
		return start;
	}
	
	public LinkNode getEnd() throws Exception
	{
		if(end == null)
		{
			throw new Exception();
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
	
	public void addCurrency(Currency value, int index) throws Exception
	{
		LinkNode added = new LinkNode(value);
		if(index>=0 && index<= count)
		{
			if(start == null&& index == 0)
			{
				start = added;
			}
		
			else if(start!= null && index ==0)
			{
				added.setNext(start);
				start = added;
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
		else
		{
			throw new Exception();
		}
	}
	
	
	
	public void removeCurrency(Currency value) throws Exception
	{
		if(start!=null)
		{
			LinkNode prev = null;
			LinkNode curr = start;
		
			if(curr.getData().isEqual(value))
			{
				curr = curr.getNext();
				start = new LinkNode(curr.getData(),curr.getNext());
				curr = start;
			}
		
			boolean deleted = false;
			for(int i =0; i<count&& deleted != true; i++)
			{
				if(!curr.getData().isEqual(value))
				{
					prev = curr;
					curr = curr.getNext();
				}
				if(curr!= null && curr.getData().isEqual(value))
				{
					prev.setNext(curr.getNext());
					curr = curr.getNext();
					deleted = true;
				}
			}
			count--;
		}
	}
	
	
	
	
	public void removeCurrency(int index)
	{
		if(index>=0 && index<count && start!=null)
		{
			LinkNode prev = null;
			LinkNode curr = start;
			
			if(index ==0)
			{	
				curr = curr.getNext();
				start = new LinkNode(curr.getData(),curr.getNext());
				curr = start;
			}
			else
			{
				for(int i =0; i<index; i++)
				{
					prev = curr;
					curr = curr.getNext();
					
					if(i==index-1)
					{
						prev.setNext(curr.getNext());
						curr = curr.getNext();
				
					}
				}
			}
			count--;
		}
	}
	
	public int findCurrency(Currency value) throws Exception
	{
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
			System.out.print(temp.getData()+ "  ");
			temp = temp.getNext();
		}
	}
	
	
	
	
}

