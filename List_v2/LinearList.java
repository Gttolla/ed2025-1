public class LinearList<T> {
    private Node head;
    private Node tail;

    public LinearList() {
        this.head = this.tail = null;
    }

    /*
     * Inserir no início da lista
     */
    public void insert(Node<T> node)
    {
        /*
         * Se a lista estiver vazia o node deve ser inserido e os valor de head e
         * tail deve ser a referência do node recebido
         */
        if (isEmpty()) {
            this.head = this.tail = node;
            return;
        }

        Node aux = this.head;
        node.setNext(aux);
        aux.setPrev(node);
        this.head = node;
    }

    public void append(Node<T> node)
    {
        /*
         * Se a lista estiver vazia o node deve ser inserido e os valor de head e
         * tail deve ser a referência do node recebido
         */
        if (isEmpty()) {
            this.head = this.tail = node;
            return;
        }

        Node aux = this.tail;
        aux.setNext(node);
        this.tail = aux.getNext();
        this.tail.setPrev(aux);

    }

    public Node<T> remove()
    {
        if (isEmpty())
        {
            return null;
        }

        Node aux = this.head;

        /*
         * Lista com apenas um nó
         */
        if (aux.getNext() == null)
        {
            this.head = this.tail = null;
            return aux;
        }

        /*
         * Lista com mais de um nó
         */
        head = aux.getNext();   // segundo nó
        aux.setNext(null); // null para o next do no removido
        head.setPrev(null);// null para o prev do novo primeiro no

        return aux;
    }

    /*
     * Remover o último nó
     */
    public Node<T> pop()
    {
        if (isEmpty())
        {
            return null;
        }

        Node aux = this.tail;

        /*
         * Lista com apenas um nó
         */
        if (aux.getPrev() == null)
        {
            this.head = this.tail = null;
            return aux;
        }

        /*
         * Lista com mais de um nó
         */
        tail = aux.getPrev();   // penultimo nó
        aux.setPrev(null); // null para o next do no removido
        tail.setNext(null);// null para o prev do novo primeiro no

        return aux;
    }

    public boolean isEmpty()
    {
        return (this.head == null & this.tail == null); 
    }

    public Node getHead()
    {
        return this.head;
    }
}
