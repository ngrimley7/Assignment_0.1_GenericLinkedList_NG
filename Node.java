/**
 * The Node class represents a single node in a linked list.
 * Each node contains data of generic type T and a reference to the next node.
 *
 * @param <T> The type of data stored in the node.
 */
public class Node<T> {

    /**
     * Data stored in this node.
     */
    private T data;

    /**
     * Reference to the next node.
     */
    private Node<T> nextNode;

    /**
     * Constructs a new Node with no data and a null reference to the next node.
     */
    public Node() {
        this.nextNode = null;
    }

    /**
     * Sets the data of this node.
     *
     * @param d The data to be set in this node.
     */
    public void setData(T d) {
        this.data = d;
    }

    /**
     * Gets the next node in the linked list.
     *
     * @return The next node in the list.
     */
    public Node<T> getNextNode() {
        return this.nextNode;
    }

    /**
     * Sets the reference to the next node.
     *
     * @param nextNode The next node to be linked to this node.
     */
    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}
