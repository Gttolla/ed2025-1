public class QueueImpl<T> implements IQueue<T> {
    private LinearList<T> list;

    public QueueImpl() {
        this.list = new LinearList<T>();
    }

    @Override
    public void insert(Node<T> node) throws Exception {
        list.append(node);
    }

    @Override
    public Node<T> remove() {
        return list.remove();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.getSize();
    }
}

