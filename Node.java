/**
 * Class for creating Node object
 * @author Fanni Kertesz
 * @version 08/30/23
 *
 */
class Node <T>{
	T data;//generic type data stored
	Node<T> nextNode;//next node
	
	/**
	 * empty argument constructor setting stored variables to null
	 */
	public Node()
	{
		nextNode=null;
		data=null;
	}//end constructor
	
	/**
	 * @param new data to be set
	 */
	public void setData(T data) {
		this.data=data;
	}//end setData
	
	/**
	 * @return current data
	 */
	public Node<T> getNode() {
		return this;
	}//end getNode
	
	/**
	 * @param new nextNode to be set
	 */
	public void setNextNode(Node<T> nextNode)
	{
		this.nextNode=nextNode;
	}//end setNextNode
	
	
}//end class