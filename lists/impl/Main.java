
public class Main {
    public static void main(String[] args) throws Exception {
        LinearList ll = new LinearList<>();
        try {
            for (int n = 0; n < 5; n++) {
                ll.insert(new Node(n * 10 + n));
            }
            for (int n = 5; n < 10; n++) {
                ll.append(new Node(n * 10 + n));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            show(ll);
        } catch (Exception ex) {
            System.exit(-1);
        }

        for (int i = 0; i < 10; i++) {
            Node node = ll.remove();
            System.out.println("Info: " + node.getInfo());
            try {
                show(ll);
            } catch (Exception ex) {
                break;
            }
        }

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
            System.out.printf("[%4d]->", aux.getInfo());
            aux = aux.getNext();
        }
        System.out.println("/");
        System.out.println("\nInicio -> " + ll.getHead().getInfo());
        System.out.println("\nTail -> " + ll.getTail().getInfo());
        System.out.println("\nSize -> " + ll.getSize());
    }
}