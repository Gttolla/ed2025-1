public class StackImpl<T> implements IStack<T> {
        private LinearList<T> list;

    public StackImpl() {
        this.list = new LinearList<T>();
    }

    @Override
    public void push(Node<T> node) throws Exception {
        list.append(node); // Insere no topo (início da lista)
    }

    @Override
    public Node<T> pop() {
        return list.pop(); // Remove do topo (início da lista)
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.getSize();
    }
}

