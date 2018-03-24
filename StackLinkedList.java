

import java.util.NoSuchElementException;

public class StackLinkedList<E> implements stackInt {

	
	
	private Node<E> topOfStackRef = null;
	
	public E push(E obj)
	{
		topOfStackRef = new Node<>(obj, topOfStackRef);
		return obj;
	}
	
	public E pop()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		else
		{
			E result = topOfStackRef.data;
			topOfStackRef = topOfStackRef.next;
			return result;
		}
	}
	public E peek()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		return topOfStackRef.data;
	}
	
	public boolean isEmpty()
	{
		return topOfStackRef == null;
	}




}
