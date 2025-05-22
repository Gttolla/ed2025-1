

public class Heap {
	
	private double log2(double n)
	{
		return Math.log(n) / Math.log(2);
	}
	
    public void show(int[] vector)
    {
        for (int i=0; i < vector.length; i++)
        {
            System.out.printf("%4d", vector[i]);
        }
        System.out.println();
    }

	private void swap(int[] vector, int a, int b)
	{
		int aux = vector[a];
		vector[a] = vector[b];
		vector[b] = aux;
		show(vector);
	}

	public void maxHeap(int[] vector)
	{
		double medium = (int) Math.pow(2.0,log2(vector.length)) - 2.0;
		for (int i = (int)medium; i >= 0; i--)
		{
			createMaxHeap(i, vector, vector.length);
		}
	}
	
	public void maxHeap(int root, int[] vector, int size)
	{
		createMaxHeap(root, vector, size);
	}

	private void createMaxHeap(int root, int[] vector, int size)
	{
		int left = root * 2 + 1;
		int right = root * 2 + 2;
		int max = root;
		
		if (left < size && vector[root] < vector[left])
		{
			max = left;
		}
		
		if (right < size && vector[max] < vector[right])
		{
			max = right;
		}
	
		if (root != max)
		{
			swap(vector, root, max);
			createMaxHeap(max, vector, size);
		}
	}	
}

