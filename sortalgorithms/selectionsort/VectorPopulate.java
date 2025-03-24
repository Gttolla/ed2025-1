import java.util.Random;

public final class VectorPopulate {
    public static void init(int[] vector) {
        Random random = new Random();
		int size = vector.length;
        for (int indx=0; indx < size; indx++)
		{
			vector[indx] = random.nextInt(size*2);
		}
    }
}
