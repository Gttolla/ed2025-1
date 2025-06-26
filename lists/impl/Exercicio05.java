import java.util.Scanner;

public class Exercicio05 {
	StackImpl operandos = new StackImpl<Integer>();
    StackImpl operacao = new StackImpl<>();
    QueueImpl expressao = new QueueImpl<>();
	
	
    public void exec() throws Exception
    {
        Scanner in = new Scanner(System.in);

        String expr = in.next();

        for (int i=0; i < expr.length(); i++)
        {
            expressao.insert(new Node(new Info(i, expr.charAt(i))));
        }

		// Estágio 1
        calculate(1);
		
		StackImpl operandosTemp = new StackImpl<Integer>();
        StackImpl operacaoTemp = new StackImpl<>();
		
		while (!operandos.isEmpty())
		{
			operandosTemp.push(operandos.pop());
		}
		
		while (!operacao.isEmpty())
		{
			operacaoTemp.push(operacao.pop());
		}
		
		while (!operandosTemp.isEmpty())
		{
			Node n = operandosTemp.pop();
			Node o = operacaoTemp.pop();
			
			if (n != null)
			{
				expressao.insert(n);
			}
			
			if (o != null)
			{
				expressao.insert(o);
			}
		}

		// Estagio 2
		calculate(2);

        if (!operandos.isEmpty()) {
            int res = (int) operandos.pop().getInfo().getInfo();
            System.out.println("\nResultado: " + res);
        }
    }
	
	private void calculate(int stage) throws Exception
	{
        if (expressao.isEmpty())
        {
            return;
        }

        boolean stage1 = false;
		while (!expressao.isEmpty())
        {
            Node e = expressao.remove();
            if (e == null)
            {
                continue;
            }

            Object objInfo = e.getInfo().getInfo();

            if (e instanceof Character) {
                switch((char)e.getInfo().getInfo())
                {
                    case '*' :
                    case '/' :
                    {
                        stage1 = true;
                    }
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
                        char caractere = (char) e.getInfo().getInfo();
                        int numero = caractere - '0';	
                        operandos.push(new Node(new Info(numero, numero)));
                        break;
                    }
                }
            }
            else if (objInfo instanceof Integer){
                operandos.push(e);
            }
            
            if (stage == 2 && operandos.getSize() == 2)
            {
                int n1 = (int) operandos.pop().getInfo().getInfo();
                int n2 = (int) operandos.pop().getInfo().getInfo();
                char op = (char) operacao.pop().getInfo().getInfo();
                if (op == '+')
                {
                    n1 = n2 + n1;
                }
                else // op == '-'
                {
                    n1 = n2 - n1;
                }
                operandos.push(new Node(new Info(n1, n1)));
            }

            if (stage == 1 && stage1)
            {
                stage1 = false;
                int n1 = (int) operandos.pop().getInfo().getInfo();
                char caractere = (char) expressao.remove().getInfo().getInfo();
                int n2 = caractere - '0';
                char op = (char) operacao.pop().getInfo().getInfo();
                if (op == '*')
                {
                    n1 = n1 * n2;
                }
                else 
                {
                    if (op == '/')
                    {
                        n1 = n1 / n2;
                    }
                }

                operandos.push(new Node(new Info(n1,n1)));
            }
        }
	}
}
