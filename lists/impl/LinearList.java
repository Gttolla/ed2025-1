
public class LinearList<T> {
    private Descriptor<T> descr;

    public LinearList() {
        this.descr = new Descriptor<T>();
    }

    public Node<T> getHead() {
        return descr.getHead();
    }

    public Node<T> getTail() {
        return descr.getTail();
    }

    public int getSize() {
        return descr.getSize();
    }

    public boolean isEmpty() {
        return descr.isEmpty();
    }

    /*
     * Inserção no início da lista linear
     */
    public void insert(Node<T> node) throws Exception {
        /*
         * Nó nulo
         */
        if (node == null) {
            throw new Exception("Node is null");
        }

        if (descr.isEmpty()) {
            /*
             * Lista vazia
             */
            descr.setHead(node);
            descr.setTail(node);
        } else {
            /*
             * Lista nã0 vazia
             */
            Node head = descr.getHead();
            node.setNext(head);
            head.setPrev(node);
            descr.setHead(node);
        }

        /*
         * Aumenta o tamanho da lista
         */
        descr.setSize(descr.getSize() + 1);
    }

    /*
     * Inserir no final da lista linear
     */

    public void append(Node<T> node) throws Exception {
        /*
         * Nó nulo
         */
        if (node == null) {
            throw new Exception("Node is null");
        }

        if (descr.isEmpty()) {
            /*
             * Lista vazia
             */
            descr.setHead(node);
            descr.setTail(node);
        } else {
            Node tail = descr.getTail();
            tail.setNext(node);
            node.setPrev(tail);
            descr.setTail(node);
        }

        /*
         * Aumenta o tamanho da lista
         */
        descr.setSize(descr.getSize() + 1);
    }

    /*
     * Remover do início da Lista linear
     */

    public Node<T> remove() {
        if (descr.isEmpty()) {
            return null;
        }

        Node node = descr.getHead();
        descr.setHead(node.getNext());

        if (descr.getHead() == null) {
            descr.setTail(descr.getHead());
        } else {
            descr.getHead().setPrev(null);
        }

        node.setPrev(null);
        node.setNext(null);

        descr.setSize(descr.getSize() - 1);

        return node;
    }

    public Node<T> pop() {
        if (descr.isEmpty()) {
            return null;
        }

        Node<T> node = descr.getTail();
        Node<T> prevNode = node.getPrev();

        if (prevNode == null) {
            // Só há um elemento na lista
            descr.setHead(null);
            descr.setTail(null);
        } else {
            prevNode.setNext(null);
            descr.setTail(prevNode);
        }

        node.setNext(null);
        node.setPrev(null);

        descr.setSize(descr.getSize() - 1);

        return node;
    }

    public void insertAt(Node<T> node, int pos) throws Exception {
    if (node == null) throw new Exception("Node is null");
    if (pos < 0 || pos > descr.getSize()) throw new Exception("Invalid position");

    if (pos == 0) {
        insert(node);
    } else if (pos == descr.getSize()) {
        append(node);
    } else {
        Node<T> current = descr.getHead();
        for (int i = 0; i < pos; i++) {
            current = current.getNext();
        }

        Node<T> prev = current.getPrev();
        prev.setNext(node);
        node.setPrev(prev);

        node.setNext(current);
        current.setPrev(node);

        descr.setSize(descr.getSize() + 1);
    }
}

public Node<T> removeFrom(int pos) throws Exception {
    if (pos < 0 || pos >= descr.getSize()) throw new Exception("Invalid position");

    if (pos == 0) return remove();
    if (pos == descr.getSize() - 1) return pop();

    Node<T> current = descr.getHead();
    for (int i = 0; i < pos; i++) {
        current = current.getNext();
    }

    Node<T> prev = current.getPrev();
    Node<T> next = current.getNext();

    prev.setNext(next);
    next.setPrev(prev);

    current.setNext(null);
    current.setPrev(null);

    descr.setSize(descr.getSize() - 1);
    return current;
}


public void insertNext(Node<T> node, Node<T> nodePos) throws Exception {
    if (node == null || nodePos == null) throw new Exception("Node is null");

    Node<T> next = nodePos.getNext();
    nodePos.setNext(node);
    node.setPrev(nodePos);

    if (next != null) {
        node.setNext(next);
        next.setPrev(node);
    } else {
        descr.setTail(node); // Inserção no final
    }

    descr.setSize(descr.getSize() + 1);
}

public Node<T> removeNext(Node<T> nodePos) throws Exception {
    if (nodePos == null || nodePos.getNext() == null) throw new Exception("No next node to remove");

    Node<T> node = nodePos.getNext();
    Node<T> next = node.getNext();

    nodePos.setNext(next);
    if (next != null) {
        next.setPrev(nodePos);
    } else {
        descr.setTail(nodePos); // Remoção do último
    }

    node.setNext(null);
    node.setPrev(null);

    descr.setSize(descr.getSize() - 1);
    return node;
}

public void insertPrev(Node<T> node, Node<T> nodePos) throws Exception {
    if (node == null || nodePos == null) throw new Exception("Node is null");

    Node<T> prev = nodePos.getPrev();
    node.setNext(nodePos);
    nodePos.setPrev(node);

    if (prev != null) {
        prev.setNext(node);
        node.setPrev(prev);
    } else {
        descr.setHead(node); // Inserção no início
    }

    descr.setSize(descr.getSize() + 1);
}

public Node<T> removePrev(Node<T> nodePos) throws Exception {
    if (nodePos == null || nodePos.getPrev() == null) throw new Exception("No previous node to remove");

    Node<T> node = nodePos.getPrev();
    Node<T> prev = node.getPrev();

    nodePos.setPrev(prev);
    if (prev != null) {
        prev.setNext(nodePos);
    } else {
        descr.setHead(nodePos); // Remoção do primeiro
    }

    node.setNext(null);
    node.setPrev(null);

    descr.setSize(descr.getSize() - 1);
    return node;
}

}