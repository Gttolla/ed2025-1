public class Queue<T> extends LinearList {

    public Queue()
    {
        super();
    }

    public void insertInQueue(Node<T> node) throws Exception
    {
        append(node);
    }

    public Node<T> removeFromQueue()
    {
        return remove();
    }

    public void Destroy() throws Exception
    {
        throw new Exception("Not implemented");
    }
}
