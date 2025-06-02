
public class Main {
    public static void main(String[] args) {
        LinearList ll = new LinearList<>();
        try {
            for (int n=0; n < 5; n++)
            {
                ll.insert(new Node(n * 10 + n));
            }
            for (int n=5; n < 10; n++)
            {
                ll.append(new Node(n * 10 + n));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        show(ll);

    }

    public static void show(LinearList ll) {
        Node aux = !ll.isEmpty() ? ll.getHead() : null;
        while (aux != null) {
            System.out.printf("[%4d]->", aux.getInfo());
            aux = aux.getNext();
        }
        System.out.println("/");
        System.out.println("\nInicio -> " + ll.getHead().getInfo());
        System.out.println("\nTail -> " + ll.getTail().getInfo());
        System.out.println("\nSize -> " + ll.getSize());
    }
}