import java.util.Iterator;
import java.util.NoSuchElementException;
public class Stack<Item> implements Iterable<Item> {
    private int N;          // size of the stack
    private Node first;     // top of stack

    // helper linked list class
    private class Node {
        private Item item;
        private Node next;
    }

   /**.
     * Create an empty stack.
     */
    public Stack() {
        first = null;
        N = 0;
    }

   /**.
     * Is the stack empty?
     *By the analysis the the time constant of the following method
     *is O(1).
     *The statment of the method executes only once when the method calls.
     */
    public boolean isEmpty() {
        return first == null;
    }

   /**.
     * Return the number of items in the stack.
     * By the analysis the the time constant of the following method
     *is O(1).
     *The statment of the method executes only once when the method calls.
     */
    public int size() {
        return N;
    }

   /**.
    *By the analysis the the time constant of the following method
    *is O(1).
    *The statment of the method executes only once when the method calls.
     */
    public void push(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

   /**.
     *By the analysis the the time constant of the following method
     *is O(1).
     *The statment of the method executes only once when the method calls.
     * Delete and return the item most recently added to the stack.
     * Throw an exception if no such item exists because the stack is empty.
     */
    public Item pop() {
        if (isEmpty()) throw new RuntimeException("Stack underflow");
        Item item = first.item;        // save item to return
        first = first.next;            // delete first node
        N--;
        return item;                   // return the saved item
    }


   /**.
     * Return the item most recently added to the stack.
     *By the analysis the the time constant of the following method
     *is O(1).
     *The statment of the method executes only once when the method calls.
     * Throw an exception if no such item exists because the stack is empty.
     */
    public Item peek() {
        if (isEmpty()) throw new RuntimeException("Stack underflow");
        return first.item;
    }

   /**.
     *By the analysis the the time constant of the following method
     *is O(N).
     *As the for loop iterates upto the N values.
     * Return string representation.
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item : this)
            s.append(item + " ");
        return s.toString();
    }
       

   /**.
     *The time complexity of the iterator class is the O(N).
     * As the the it iterates upto the number of items
     * present in it.
     * Return an iterator to the stack that iterates through
     * the items in LIFO order.
     */
    public Iterator<Item> iterator()  { return new ListIterator();  }

    // an iterator, doesn't implement remove() since it's optional
    private class ListIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next; 
            return item;
        }
    }
}

