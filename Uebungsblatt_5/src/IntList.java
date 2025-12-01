class IntList {
    
    private class ListCell {
        int content;
        ListCell next;
        
        ListCell(int x, ListCell n) {
            this.content = x;
            this.next = n;
        }
    }
    public class Iterator {
        private ListCell curser;

        private Iterator(ListCell start) {
            curser = start;
        }
        public boolean hasNext() {
            return curser != null;
        }
        public int next() {
            int currentContent = curser.content;
            curser = curser.next;
            return currentContent;
        }
    }

    public ListCell head;

    public Iterator iterator() {
        return new Iterator(head);
    }
    public IntList() {
        head = null;
    }
    
    public void addFirst(int x) {
        ListCell newHead = new ListCell(x, head);
        head = newHead;
    }

    public Integer getFirst() {
        //empty list?
        if (head == null) {
            return null;
        }
        return head.content;
    }

    public boolean dropFirst() {
        if (head == null) {
            return false;
        }
        head = head.next;
        return true;
    }

    public void addLast(int x) {
        // add to empty list
        if (head == null) {
            head = new ListCell(x, null);
            return;
        }
        //add to non-empty list
        ListCell c = head;
        while (c.next != null) {
            c = c.next;
        }
        c.next = new ListCell(x, null);
    }

    public Integer getLast() {
        //empty list?
        if (head == null) {
            return null;
        }
        //go to last element
        ListCell c = head;
        while (c.next != null) {
            c = c.next;
        }
        return c.content;
    }

    public boolean dropLast() {
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            head = null;
            return true;
        }
        ListCell c = head;
        while (c.next != null && c.next.next != null) {
            c = c.next;
        }
        c.next = null;
        return true;
    }
    
    public void remove(int x) {
        // remove all list elements where content is equal to x
        ListCell c = head;

        //remove head element
        while (c != null && x == c.content) {
            head = c = c.next;
        }

        //empty list?
        if (c == null) {
            return;
        }

        //traverse list
        while (c.next != null) {
            if (c.next.content == x) {
                //found, now remove
                c.next = c.next.next;
            } else {
                c = c.next;
            }
        }

    }
    
    public boolean contains(int x) {
        for (ListCell c = head; c != null; c = c.next) {
            if (c.content == x) {
                return true;
            }
        }
        return false;
    }
    
    public int size() {
        int size = 0;
        for (ListCell c = head; c != null; c = c.next) {
            size++;
        }
        return size;
    }
    
    boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (ListCell c = head; c != null; c = c.next) {
            sb.append(c.content);
            if (c.next != null) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}