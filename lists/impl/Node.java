
public class Node<T> {
    private Node<T> prev;
    private Node<T> next;
    private T info;

    public Node() {
        this.next = this.prev = null;
    }

    public Node(T info) {
        this.info = info;
        this.next = this.prev = null;
    }

    // Getter e Setter para prev
    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    // Getter e Setter para next
    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    // Getter e Setter para info
    public T getInfo() {
        return info;
    }

    public void setInfo(T info)
    {
        this.info = info;
    }

}
