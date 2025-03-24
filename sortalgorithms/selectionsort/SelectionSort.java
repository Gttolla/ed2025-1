
public class SelectionSort {
	public void sort(int[] vector)
	{
		int size = vector.length;	
		//show(vector);
		long statedTime = System.nanoTime();
		
		for(int indx=0; indx < size - 1; indx++) {
			for (int indy=indx+1; indy < size;indy++)
			{
				if (vector[indx] > vector[indy])
				{
					swap(vector, indx, indy);
					//show(vector, indx, indy);
				}
			}
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
	
	public void show(int[] vector, int i, int j)
	{
		final String ANSI_RESET = "\u001B[0m";
		final String ANSI_RED = "\u001B[31m";
		int size = vector.length;

		for (int k = 0; k < size; k++) {
			if (k == i || k == j) {
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