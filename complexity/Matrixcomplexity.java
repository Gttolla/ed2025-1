import java.util.Random;
import java.time.Instant;
import java.time.Duration;

public class Matrixcomplexity {
	public static void main(String[] args)
	{
		Instant initNow = Instant.now();
		if (args.length < 1) {
			System.exit(-1);
		}
		Random rand = new Random();
		int size = Integer.parseInt(args[0]);
		double[][] matrix = new double[size][size];
		
		for (int indx=0; indx < size; indx++)
		{
			for (int indy=0; indy < size; indy++)
			{
				matrix[indx][indy] = rand.nextInt(100000);
			}
		}
		
		Instant finalNow = Instant.now();
		Duration intTime = Duration.between(initNow, finalNow);
		
		System.out.println("\nTempo: " + intTime.toMillis() + "\n");
	}
}