public class LinkNode {
	private Currency data;
	private LinkNode next;
	
	public LinkNode()
	{
		data = null;
		next = null;
	}
	
	public LinkNode(Currency val)
	{
		data = val;
		next = null;
	}
	
	public LinkNode(Currency val, LinkNode nx)
	{
		data = val;
		next = nx;
	}
	
	public Currency getData()
	{
		return data;
	}
	
	public LinkNode getNext()
	{
		return next;
	}
	
	public void setData(Currency val)
	{
		data = val;
	}
	
	public void setNext(LinkNode nx)
	{
		next = nx;
	}
	
}
