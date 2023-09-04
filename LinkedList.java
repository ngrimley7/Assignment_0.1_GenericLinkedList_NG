package linkedList;
/**
 * @author njohnson3
 *
 */
public class LinkedList<T> {
	
	Node<T> head;
	int length;
	Node<T> tail;
	
	
	public LinkedList()
	{
		head=null;
		this.length = 0;
		tail=head;
	}
	
	
	public boolean isEmpty()
	{
		if (head==null) { 
			return true;
		}else {
			return false;
		}
	}
	
	
	public Node<T> getList()
	{
		return head;
	}
	
	
	public void addNode(Node<T> aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		tail.nextNode=aNode;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> myList = new LinkedList<String>();
		
		Node<String> aNode = new Node<String>();
		aNode.setData("Niall");
		myList.addNode(aNode);
		
		aNode = new Node<String>();
		aNode.setData("Grimley");
		myList.addNode(aNode);
		
		Node<String> tempnode = myList.getList();
		do 
		{
			System.out.println(tempnode.data);
			tempnode=tempnode.nextNode;
		} while (tempnode!=null);
			
		
		

	}

}