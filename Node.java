

public class Node<E> {


	protected E data;
	protected Node<E> next;
	protected Node<E> prev;
	
	protected Node(E dataItem)
	{
		data = dataItem;
		next = null;
		prev = null;
	}
	
	protected Node(E dataItem, Node<E> nodeRef){
		data = dataItem;
		next = nodeRef;
		prev = null;
	}
	
	protected E getData()
	{
		return data;
	}
	
}
