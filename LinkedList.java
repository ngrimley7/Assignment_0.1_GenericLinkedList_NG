package linkedList;

/**
 * The LinkedList class represents a singly linked list of elements of generic type T.
 *
 * @param <T> The type of elements stored in the linked list.
 */
public class LinkedList<T> {

    private Node<T> head;
    private int length;
    private Node<T> tail;

    /**
     * Constructs an empty linked list.
     */
    public LinkedList() {
        head = null;
        length = 0;
        tail = head;
    }

    /**
     * Checks if the linked list is empty.
     *
     * @return true if the linked list is empty, false otherwise.
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Gets the head node of the linked list.
     *
     * @return The head node of the linked list.
     */
    public Node<T> getList() {
        return head;
    }

    /**
     * Adds a node to the end of the linked list.
     *
     * @param aNode The node to be added.
     */
    public void addNode(Node<T> aNode) {
        if (isEmpty()) {
            head = aNode;
            tail = head;
        } else {
            tail.nextNode = aNode;
            tail = tail.nextNode;
            tail.nextNode = null;
        }
        length++;
    }

    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();

        Node<String> aNode = new Node<String>();
        aNode.setData("Niall");
        myList.addNode(aNode);

        aNode = new Node<String>();
        aNode.setData("Grimley");
        myList.addNode(aNode);

        Node<String> tempNode = myList.getList();
        do {
            System.out.println(tempNode.data);
            tempNode = tempNode.nextNode;
        } while (tempNode != null);
    }
}
