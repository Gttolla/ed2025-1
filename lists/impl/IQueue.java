public interface IQueue<T> {
    public void insert(Node<T> node) throws Exception;
    public Node<T> remove();
    public boolean isEmpty();
}

