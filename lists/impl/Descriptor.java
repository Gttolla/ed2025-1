

public class Descriptor<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public Descriptor() {
        this.head = this.tail = null;
        this.size = 0;
    }

    // Getter e Setter para head
    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    // Getter e Setter para tail
    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    // Getter e Setter para size
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty()
    {
        return (this.size == 0 
            && this.head == null
            && this.tail == null);
    }
}
