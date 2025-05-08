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
