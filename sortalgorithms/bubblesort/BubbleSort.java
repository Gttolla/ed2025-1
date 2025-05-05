
public class BubbleSort {
	public void sort(int[] vector)
	{
		int size = vector.length;
		int times = 0;
		int roof = 0;
		boolean changed = true;
		
		//show(vector);
		long statedTime = System.nanoTime();
		while(changed) {
			changed = false;
			roof++;
			for (int i=0; i < (size - roof);i++, times++)
			{
				if (vector[i] > vector[i+1])
				{
					swap(vector, i, i+1);
					//show(vector);
					changed = true;
				}
			}
		}
		
		long endedTime = System.nanoTime();
		
		long sliceTime = endedTime - statedTime;

        double elapsedTime = sliceTime / 1_000_000.0;
		System.out.println("Tempo de execução: " + elapsedTime + " ms");
	}
	
	private void swap(int[] vector,int x, int y) {
		int aux = vector[x];
		vector[x] = vector[y];
		vector[y] = aux;
	}
	
	public void show(int[] vector)
	{
		int size = vector.length;
		System.out.println();
		for (int i=0; i < size; i++)
		{
			System.out.printf("%4d", vector[i]);
		}
	}
}