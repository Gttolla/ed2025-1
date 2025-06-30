
public class Node<T> {
    private Node<T> prev;
    private Node<T> next;
    private Info<T> info;

    public Node() {
        this.next = this.prev = null;
    }

    public Node(Info<T> info) {
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
    public Info<T> getInfo() {
        return info;
    }

    public void setInfo(Info<T> info)
    {
        this.info = info;
    }

}
