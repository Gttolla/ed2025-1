import java.util.Scanner;

public class Exercicio02 {
    public void exec() throws Exception
    {
        StackImpl stack = new StackImpl<>();
        int number = 0;
        Scanner in = new Scanner(System.in);

        for (;number >= 0;)
        {
            number = in.nextInt();
            if (number < 0)
            {
                continue;
            }
            Info info = new Info(number,number+"");
            Node node = new Node(info);
            stack.push(node);
        }

        while (!stack.isEmpty())
        {
            System.out.print(stack.pop().getInfo().getInfo() + " ");            
        }
    }
}
