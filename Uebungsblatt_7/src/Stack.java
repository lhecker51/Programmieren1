/**
 * Interface for a Stack of an abstract type.
 * Follows the FIFO-principle.
 *
 * @param <E> type of elements in stack
 */
public interface Stack <E>{

    /**
     * Puts an element on the stack.
     *
     * @param element element of type E
     */
    public void push(E element);

    /**
     * Removes the top element of the stack and returns its value.
     * Returns null if stack is empty.
     *
     * @return  value of element on top of stack
     */
    public E pop();

    /**
     * Returns the value of the top element of the stack.
     * Returns null if stack is empty and does not change stack.
     *
     * @return value of element on top of stack
     */
    public E top();

    /**
     * Checks if a stack is empty.
     *
     * @return true if empty, false if not
     */
    public boolean isEmpty();

    /**
     * Returns the number of elements in a stack.
     *
     * @return number of elements
     */
    public int size();

}
