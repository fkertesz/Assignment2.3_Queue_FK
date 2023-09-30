/**
 * Class for creating LinkedList object
 * @author Fanni Kertesz
 * @version 09/28/23
 */
public class LinkedList<T> {
	
	Node<T> head;//generic type Node object for head
	int length;//length of the list
	Node<T> tail;//generic type Node object for tail
	
	/**
	 * empty argument constructor that sets variables to null
	 */
	public LinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}//end constructor
	
	/**
	 * method for checking if the head Node is empty
	 * @return corresponding boolean value
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}//end isEmpty
	
	/**
	 * @return current head
	 */
	public Node<T> getList()
	{
		return head;
	}//end getList
	
	/**
	 * method for adding a node to the list
	 * @param new Node to be added
	 */
	public void addNode(Node<T> aNode)
	{
		//checks if head is empty and if so, adds the new Node
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}//end if
		
		//changes other variables according to new Node
		tail.nextNode=aNode;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		
	}//end addNode
	
	/**
	 * removes the first node in the list.
	 * @return removed node's data
	 */
	public T removeNode()
	{
		Node<T> result = new Node<T>();
		if(!isEmpty())
		{
		result = head;
		head=head.nextNode;
		if(head==null)
			tail=null;
		length--;
		}
		return result.data;
	}


}//end class