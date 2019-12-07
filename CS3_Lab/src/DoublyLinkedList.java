class Link
{
	public Object data;
	public Link next;
	public Link previous;
	
	public Link(Object o)   
    {
    	data = o;
    } 
	
	public String toString() {
		return data.toString();
	}
}

class DoublyLinkedList
{
	private Link first; // reference to first link on list
	private Link last; // reference to first link on list
	
	public DoublyLinkedList()
	{
		first = null;
		last = null;
	}
	public boolean isEmpty()
	{
		return (first == null);
	}
	
	public void insertFirst(Object d)
	{
		Link newLink = new Link(d);
		if( isEmpty() ) { 
			last = newLink;
		} else {
			first.previous = newLink;
		}
		newLink.next = first;
		first = newLink; 
	}
	
	public void insertLast(Object d)
	{
		Link newLink = new Link(d);
		if( isEmpty() ) 
			first = newLink; 
		else
		{
			last.next = newLink;
			newLink.previous = last; 
		}
		last = newLink;
	}
	
	public Object removeFirst() 
	{ 
		Object temp = first.data;
		if(first.next == null)
			last = null; 
		else
			first.next.previous = null; 
		first = first.next;
		return temp;
	}
	
	public Object removeLast()
	{ 
		Object temp = last.data;
		if(first.next == null)
			first = null;
		else
			last.previous.next = null; 
		last = last.previous; 
		return temp;
	}
	public Object getFirst()
	{
		return first.data;
	}
	public Object getLast()
	{
		return last.data;
	}
	public void displayForward()
	{
		System.out.print("[ ");
		Link current = first; 
		while(current != null) 
		{
		System.out.print(current + " ");
		current = current.next; 
		}
		System.out.println("]");
	}	
	
	public void displayBackward()
	{
		System.out.print("[ ");
		Link current = last; 
		while(current != null)
		{
			System.out.print(current + " "); 
			current = current.previous; 
		}
		System.out.println("]");
	}
	
	boolean insertBefore(Object key, Object dd)
	{
		Link tmp = new Link(dd);
		Link current= first;
		if(current == null)
			return false;
		while(current != null)
		{
			if(current.data.equals(key) && current.equals(first))
			{
				tmp.next = current;
				tmp.previous = null;
				current.previous = tmp;
				return true;
			}
			if(current.data.equals(key))
			{
				tmp.next = current;
				tmp.previous = current.previous;
				current.previous = tmp;
				current.previous.next = tmp;
				return true;
			}
			current = current.next;
		}
			return false;
	}
	
	void insertToSorted(Comparable x)
	{
		Link current = first;
		Link tmp = new Link(x);
		while(current != null)
		{
			if(((Comparable) current.data).compareTo(x) == 1 || ((Comparable) current.data).compareTo(x) == 0)
			{
				current.previous = tmp;
				tmp.next = current;
				tmp.previous = current.previous;
				current.previous.next = tmp;
				return;
			}
			current = current.next;
		}
	}
	
	void insertionSort()
	{
		
	}
	
}