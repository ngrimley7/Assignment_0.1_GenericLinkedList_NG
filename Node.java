public class Node {
	/**
	 * @author njohnson3
	 *
	 */
	class Node<T> {
		T data;
		Node<T> nextNode;
		
		
		
		public Node()
		{
			this.nextNode=null;
		}
		
		
		
		public void setData(T d) {
			this.data = d;
		}
		
		public Node<T> getNode() {
			return this.nextNode;
		}
		
		public void setNextNode(Node<T> nextNode)
		{
			this.nextNode=nextNode;
		}
		
		
	}
}
