
public class Main {

public static void main2(String[] args)
    {
        QueueImpl<String> queue = new QueueImpl<>();

        try {
            queue.insert(new Node<>(new Info<>(1,"1")));
            queue.insert(new Node<>(new Info<>(2,"2")));
            queue.insert(new Node<>(new Info<>(3,"3")));
            queue.insert(new Node<>(new Info<>(4,"4")));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        try {
            while (!queue.isEmpty())
            {
                Node<String> n = queue.remove();
                System.out.println( n.getInfo().getId() + " " + n.getInfo().getInfo());
            }    
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
    }

    public static void main(String[] args)
    {
        StackImpl<String> stack = new StackImpl<>();

        try {
            stack.push(new Node<>(new Info<>(1,"1")));
            stack.push(new Node<>(new Info<>(2,"2")));
            stack.push(new Node<>(new Info<>(3,"3")));
            stack.push(new Node<>(new Info<>(4,"4")));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        try {
            while (!stack.isEmpty())
            {
                Node<String> n = stack.pop();
                System.out.println( n.getInfo().getId() + " " + n.getInfo().getInfo());
            }    
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
    }

    public static void main1(String[] args) throws Exception {
        LinearList<String> ll = new LinearList<String>();
        try {
            for (int n = 0; n < 5; n++) {
                ll.insert(new Node(new Info(n, Integer.toString(n * 10 + n))));
            }
            for (int n = 5; n < 10; n++) {
                ll.append(new Node(new Info(n, Integer.toString(n * 10 + n))));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            show(ll);
        } catch (Exception ex) {
            System.exit(-1);
        }

        ll.insertAt(new Node(new Info(100, Integer.toString(100))), 4);

        try {
            show(ll);
        } catch (Exception ex) {
            System.exit(0);
        }
    }

    public static void show(LinearList ll) throws Exception {
        if (ll.isEmpty()) {
            throw new Exception("List is empty");
        }

        Node aux = !ll.isEmpty() ? ll.getHead() : null;

        while (aux != null) {
            System.out.printf("[%s]->", aux.getInfo().toString());
            aux = aux.getNext();
        }
        System.out.println("/");
        System.out.println("\nInicio -> " + ll.getHead().getInfo().toString());
        System.out.println("\nTail -> " + ll.getTail().getInfo().toString());
        System.out.println("\nSize -> " + ll.getSize());
    }
}