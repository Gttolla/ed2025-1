
public class Main {
	public static void main(String[] args)
	{
		int[] vector = new int[1000000];
		VectorPopulate.init(vector);
		InsertionSort insertion = new InsertionSort();
		insertion.sort(vector);
		//selection.show(vector);
	}
}