public class HeapSort {
    private int size;

    public HeapSort()
    {
        this.size = 0;
    }

    private void swap(int[] vector, int a, int b)
	{
		int aux = vector[a];
		vector[a] = vector[b];
		vector[b] = aux;
        show(vector);
	}

    public void show(int[] vector)
    {
        for (int i=0; i < vector.length; i++)
        {
            System.out.printf("%4d", vector[i]);
        }
        System.out.println();
    }

    public void sort(int[] vector)
    {
        Heap heap = new Heap();

        this.size = vector.length;

        heap.maxHeap(vector);

        while (this.size > 0)
        {
            this.swap(vector, 0, this.size - 1);
            this.size -= 1;
            heap.maxHeap(0,vector, this.size);
        }
    }
}
