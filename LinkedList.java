

import java.util.NoSuchElementException;

public class LinkedList<E> {

	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	private Node<E> newNode = null;
	
	
	public void addFirst(E item){
		newNode = new Node<>(item);
		
		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			newNode.next = head;
			head = newNode;
		}
		size++;
	}
	
	
	public void add(int index, E item){
		
		if(index < 0 || index > size){
			throw new IndexOutOfBoundsException(Integer.toString(index));
		}
		if (index ==0){
			addFirst(item);
		}
		else
		{
			Node<E> node = getNode(index-1);
			addAfter(node, item);
		}
		
	}
	
	public void addAfter(Node<E> node, E item){
		
		newNode = new Node<>(item);
		
		newNode.next = node.next;
		node.next = newNode;
		
		if(node == tail)
		{
			tail = newNode;
		}
		
		size++;
	}
	
	public void add(E data)
	{
		newNode = new Node(data);
		add(size, data);
	}
	
	
	public Node<E> getNode(int index){
		
		Node<E> node = head;
		for(int i = 0; i < index && node != null; i++)
		{
			node = node.next;
		}
		return node;
	}	

	
	
	public E get(int index){
		if(index < 0 || index > size){
			throw new IndexOutOfBoundsException(Integer.toString(index));
		}
		Node<E> node = getNode(index);
		return node.data;
	}
	
	
	
	public E set(int index, E newValue){
		if(index < 0 || index > size){
			throw new IndexOutOfBoundsException(Integer.toString(index));
		}
		Node<E> node = getNode(index);
		E result = node.data;
		node.data = newValue;
		return result;
	}
	
	public E removeFirst(){
		
		Node<E> temp = head;
		
		if(temp != null)
		{
			head = head.next;
		}
		if (temp != head)
		{
			size--;
			return temp.data;
		}
		else
			return null;
		
	}
	
	
	
	public void remove(int index){
		if(index < 0 || index > size){
			throw new IndexOutOfBoundsException(Integer.toString(index));
		}
		if (index == 0)
		{
			removeFirst();
		}
		else
		{
			Node<E> node = getNode(index-1);
			removeAfter(node);
		}
	}
	
	
	

	public E removeAfter(Node<E> node){
		
		Node<E> temp = node.next;
		
		if(temp != null)
		{
			node.next = temp.next;
			if(temp.next==null)
			{
				tail = node;
			}
			size--;
			return temp.data;
		}
		else
		{
			return null;
		}
		
	}
	
	
	
	
	
	
	public int getSize()
	{
		return size;
	}
	
	
	/*
	public class Iter<Person>
	{
		private Person current;
		private int count = 0;
	
		public Iter()
			{
				current = (Person) head;
			}
	

	public boolean hasNext() {
		return count < size;
	}

	public Person next() {
	
		Person returnValue;
		if(!hasNext())
		{
			throw new NoSuchElementException();
		}
		
		returnValue = (Person) head;
		head = head.next;
		return returnValue;	
	}
	
	public void remove(){
		throw new UnsupportedOperationException();
	}
	
	
	}
	*/
}
