
public class ShowLinearList {
    public static void main(String[] args)
    {
        LinearList list = new LinearList();

        for (int i=0; i < 10; i++)
        {
            list.append(new Node(new Info(i,i)));
        }
        
        show(list);

        showRemoved(list);

    }

    public static void show(LinearList list)
    {
        Node aux = (Node)list.getHead();

        while (aux != null)
        {
            System.out.println(aux.getInfo().getInfo());
            aux = aux.getNext();
        }
    }

    public static void showRemoved(LinearList list)
    {
        Node aux = list.pop();
        while (aux != null)
        {
            System.out.println("Removed: " + aux.getInfo().getInfo());
            aux = list.pop();
        }
    }
}