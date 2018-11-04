
import java.util.Iterator;
import java.util.NoSuchElementException;
/**.
 * Class for bag.
 *
 * @param      <Item>  The item
 */
public class Bag<Item> implements Iterable<Item> {
    /**.
     * It is the main class for the bag.
     */
    private int numofelmnts;         // number of elements in bag
    private Node first;    // beginning of bag

    // helper linked list class
    private class Node {
        private Item item;
        private Node next;
    }
   /**
     * Create an empty stack.
     */
    public Bag() {
        first = null;
        numofelmnts = 0;
    }

   /**
     * Is the BAG empty?
     * By the analysis the time complexity of the following method
     * is O(1).As the statment of the method executes only once when
     * the method calls.
     * @return boolen value.
     */
    public boolean isEmpty() {
        return first == null;
    }

   /**
     *By the analysis the time complexity of the following method
     * is O(1).As the statment of the method executes only once when
     * the method calls.
     * Return the number of items in the bag.
     * @ return int value.
     */
    public int size() {
        return numofelmnts;
    }

   /**
     * Add the item to the bag.
     * By the analysis the time complexity of the following method
     * is O(1).As the statment of the method executes only once when
     * the method calls.
     * 
     */
    public void add(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        numofelmnts++;
    }

   /**By the analysis the time complexity of the following method
     * is O(N).As the bag class iterates upto the no.of items in the bag.
     * Return an iterator that iterates over the items in the bag.
     * @return items of the specifucc object types
     */
    public Iterator<Item> iterator()  {
        return new ListIterator();  
    }

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
