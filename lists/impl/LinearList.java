
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

    public int getSize()
    {
        return descr.getSize();
    }

    public boolean isEmpty() {
        return descr.isEmpty();
    }

    /*
     * Inserção no início da lista linear
     */
    public void insert(Node<T> node) throws Exception
    {
        /*
         * Nó nulo
         */
        if (node == null)
        {
            throw new Exception("Node is null");
        }

        if (descr.isEmpty())
        {
            /*
            * Lista vazia
            */
            descr.setHead(node);
            descr.setTail(node);
        }
        else {
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

     public void append(Node<T> node) throws Exception
     {
                /*
         * Nó nulo
         */
        if (node == null)
        {
            throw new Exception("Node is null");
        }

        if (descr.isEmpty())
        {
            /*
            * Lista vazia
            */
            descr.setHead(node);
            descr.setTail(node);
        }
        else
        {
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
}