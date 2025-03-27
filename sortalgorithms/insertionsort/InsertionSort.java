
public class InsertionSort {
	public void sort(int[] vector)
	{
		int size = vector.length;	
		//show(vector);
		long statedTime = System.nanoTime();
		
		for (int indx = 1; indx < size; ++indx) {
			int key = vector[indx];
			int indy = indx - 1;

			/* Move elements of vector[0..i-1], that are
			   greater than key, to one position ahead
			   of their current position */
			while (indy >= 0 && vector[indy] > key) {
				vector[indy + 1] = vector[indy];
				//show(vector, indy+1,indy);
				indy = indy - 1;
			}
			vector[indy + 1] = key;
			//show(vector, indy + 1, indx);
		}
		long endedTime = System.nanoTime();
		long sliceTime = endedTime - statedTime;

        double elapsedTime = sliceTime / 1_000_000.0;
		System.out.println("Tempo de execução: " + elapsedTime + " ms");// milis
	}
	
	private void swap(int[] vector,int x, int y) {
		int aux = vector[x];
		vector[x] = vector[y];
		vector[y] = aux;
	}
	
	public void show(int[] vector, int i, int indy)
	{
		final String ANSI_RESET = "\u001B[0m";
		final String ANSI_RED = "\u001B[31m";
		int size = vector.length;

		for (int k = 0; k < size; k++) {
			if (k == i || k == indy) {
				System.out.print(ANSI_RED + vector[k] + ANSI_RESET + " ");
			} else {
				System.out.print(vector[k] + " ");
			}
		}	
		System.out.println(); 
	
	}
	
	public void show(int[] vector)
	{
		this.show(vector, -1, -1);
	}
}