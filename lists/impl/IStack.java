public interface IStack<T> {
    void push(Node<T> node) throws Exception;
    Node<T> pop();
    boolean isEmpty();
}
