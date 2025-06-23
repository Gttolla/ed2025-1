import java.util.Scanner;

public class Exercicio03 {
    public void exec() throws Exception
    {
        StackImpl stack = new StackImpl<>();
        QueueImpl queue = new QueueImpl<>();
  
        Scanner in = new Scanner(System.in);

        String word = in.next();

        word = word.toUpperCase();

        for (int i=0; i < word.length(); i++)
        {
            stack.push(new Node(new Info(i, word.charAt(i))));
            queue.insert(new Node(new Info(i, word.charAt(i))));
        }

        Node sNode = stack.pop();
        Node qNode = queue.remove();

        while (!stack.isEmpty() & !queue.isEmpty())
        {
            if ((char)sNode.getInfo().getInfo() != 
                (char)qNode.getInfo().getInfo())
                {
                    System.out.println("Não é palindromo");
                    return;
                }
            sNode = stack.pop();
            qNode = queue.remove();
        }
        System.out.println("É palindromo");
    }
}
