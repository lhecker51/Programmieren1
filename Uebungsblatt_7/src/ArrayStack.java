import java.util.Arrays;

public class ArrayStack<E> implements Stack<E> {

    private Object[] stack;
    private int capacity;
    private int size;

    public ArrayStack() {
        stack = new Object[1];
        capacity = stack.length;
        size = 0;
    }

    @Override
    public void push(E element) {
        stack[size] = element;
        size++;
        if (size == capacity) {
            Object[] newStack = new Object[capacity*2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
            capacity = stack.length;
        }


    }

    @Override
    public E pop() {
        if (size == 0) {
            return null;
        } else {
            E element = (E) stack[size - 1];
            stack[size - 1] = null;
            size--;
            if ((double) size / capacity < 0.4) {
                Object[] newStack = new Object[capacity/2];
                System.arraycopy(stack, 0, newStack, 0, size);
                stack = newStack;
                capacity = stack.length;
            }
            return element;
        }
    }

    @Override
    public E top() {
        if (size == 0)
            return null;
        else{
            return (E) stack[size -1];
        }
    }

    @Override
    public boolean isEmpty() {
        return stack[0] == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(stack);
    }
}
