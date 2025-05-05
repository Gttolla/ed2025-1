

public class VerifyOrder {

    public boolean isInOrder(int[] vector)
    {
        return verify(vector, 0);
    }

    private boolean verify(int[] vector, int pos)
    {
        System.out.println("verify(v[]," + pos + ")");
        if (pos >= vector.length - 1)
        {
            return true;
        }
        return vector[pos] <= vector[pos + 1] && verify(vector, pos+1);
    }

}