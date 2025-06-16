public class Stack<T> extends LinearList<T>
{
    public Stack()
    {
        super();
    }

    public void push(Node<T> node)  throws Exception
    {
        append(node);
    }

    public Node<T> pop()
    {
        return super.pop();
    }

    public void Destroy() throws Exception
    {
        throw new Exception("not implemented");
    }

}
