
public class Main {
	public static void main(String[] args)
	{
		int[] vector = {100,88,67,34,23,1, -1, -44, 30, -55};
		SelectionSort selection = new SelectionSort();
		selection.sort(vector);
		selection.show(vector);
	}
}