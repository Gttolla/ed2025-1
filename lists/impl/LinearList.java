
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
}