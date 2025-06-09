
public class Main {
    public static void main(String[] args) throws Exception {
        LinearList<String> ll = new LinearList<String>();
        try {
            for (int n = 0; n < 5; n++) {
                ll.insert(new Node(new Info(n,Integer.toString(n * 10 + n))));
            }
            for (int n = 5; n < 10; n++) {
                ll.append(new Node(new Info(n,Integer.toString(n * 10 + n))));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            show(ll);
        } catch (Exception ex) {
            System.exit(-1);
        }

        ll.insertAt(new Node(new Info(100,Integer.toString(100))), 4);

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