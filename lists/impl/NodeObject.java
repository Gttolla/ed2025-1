
public class NodeObject {
    private NodeObject prev;
    private NodeObject next;
    private Object info;

    public NodeObject() {
        this.next = this.prev = null;
    }

    public NodeObject(Object info) {
        this.info = info;
        this.next = this.prev = null;
    }

    // Getter e Setter para prev
    public Object getPrev() {
        return prev;
    }

    public void setPrev(NodeObject prev) {
        this.prev = prev;
    }

    // Getter e Setter para next
    public NodeObject getNext() {
        return next;
    }

    public void setNext(NodeObject next) {
        this.next = next;
    }

    // Getter e Setter para info
    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info)
    {
        this.info = info;
    }

}