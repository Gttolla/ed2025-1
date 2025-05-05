
public class Main {
	public static void main(String[] args)
	{
		int[] vector = new int[100000];
		VectorPopulate.init(vector);
		SelectionSort selection = new SelectionSort();
		selection.sort(vector);
		//selection.show(vector);
	}
}