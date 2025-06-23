import java.util.Scanner;

public class Exercicio01 {
    public Exercicio01() {

    }

    public void exec() throws Exception {
        QueueImpl queue = new QueueImpl<>();
        Scanner in = new Scanner(System.in);
        String line;

        line = in.nextLine();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == '.') {
                break;
            }
            Info info = new Info(i, c);
            Node node = new Node<>(info);
            queue.insert(node);
        }
        while (!queue.isEmpty()) {
            char c = (char) queue.remove().getInfo().getInfo();
            System.out.print((c + "").toUpperCase());
        }

    }
}
