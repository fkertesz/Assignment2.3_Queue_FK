/**
 * Class for creating Queue object
 * @author Fanni Kertesz
 * @version 09/28/23
 */
public class Queue<T>
{
	private LinkedList<T> list = new LinkedList<T>();//linked list that will act as queue
	
	/**
	 * empty argument constructor
	 */
	public Queue()
	{
	}//end constructor
	
	/**
	 * preferred argument constructor
	 * @param list to set as the queue
	 */
	public Queue(LinkedList<T> list)
	{
		this.list = list;
	}//end constructor
	
	/**
	 * adds item as last node
	 * @param item to be added to queue
	 */
	public void enqueue(T item)
	{
		Node<T> aNode = new Node<T>();
		aNode.setData(item);
		list.addNode(aNode);
	}//end enqueue
	
	/**
	 * removes the first item of the queue
	 * @return the item removed
	 */
	public T dequeue()
	{
		return (T) list.removeNode();
	}//end dequeue
	
	/**
	 * getter of first node's data
	 * @return data of the first node
	 */
	public T first()
	{
		return (T) list.head.data;
	}//end first
	
	/**
	 * determines if queue if empty
	 * @return true if empty, false if not empty
	 */
	public boolean isEmpty()
	{
		return list.isEmpty();
	}//end isEmpty
	
	/**
	 * returns the length of the queue
	 * @return
	 */
	public int size()
	{
		return list.length;
	}//end size
	
	/**
	 * turns the queue into a string as a list of the items
	 * @return list of items
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		if(!this.isEmpty()) {
			Node<T> tempNode=list.getList();
			for(int i=0;i<list.length+1;i++) {
				sb.append(tempNode.data);
				//tempNode=tempNode.nextNode;
				if(i<list.length) {
					sb.append(", ");
					tempNode=tempNode.nextNode;
				}
			}//end for
		}//end if
		return sb.toString();
	}//end toString
	
	
}//end class