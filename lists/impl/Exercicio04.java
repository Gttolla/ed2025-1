import java.util.Scanner;

public class Exercicio04 {
    public void exec() throws Exception
    {
        StackImpl operandos = new StackImpl<>();
        StackImpl operacao = new StackImpl<>();
        QueueImpl expressao = new QueueImpl<>();

        Scanner in = new Scanner(System.in);

        String expr = in.next();

        for (int i=0; i < expr.length(); i++)
        {
            expressao.insert(new Node(new Info(i, expr.charAt(i))));
        }

        while (!expressao.isEmpty())
        {
            Node e = expressao.remove();
            if (e == null)
            {
                continue;
            }
            switch((char)e.getInfo().getInfo())
            {
                case '+' :
                case '-' : 
                {
                    operacao.push(e);
                    break;
                }
                case '0' :
                case '1' :
                case '2' :
                case '3' :
                case '4' :
                case '5' :
                case '6' :
                case '7' :
                case '8' :
                case '9' :
                {
                    operandos.push(e);
                    break;
                }
            }
            if (operandos.getSize() == 2)
            {
                int n1 = (int) operandos.pop().getInfo().getInfo();
                int n2 = (int) operandos.pop().getInfo().getInfo();
                char op = (char) operacao.pop().getInfo().getInfo();
                if (op == '+')
                {
                    n1 += n2;
                }
                else // op == '-'
                {
                    n1 -= n2;
                }
                operandos.push(new Node(new Info(n1, n1)));
            }
        }

        int res = (int) operandos.pop().getInfo().getInfo();

        System.out.println("\nResultado: " + res);
    }
}
