

public class Main {
    public static void main(String[] args)
    {
        int[] v = {0,1,2,-1,4,5,6};
        VerifyOrder vo = new VerifyOrder();
        boolean inOrder = vo.isInOrder(v);

        System.out.println(inOrder);
    }
}