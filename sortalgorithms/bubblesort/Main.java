
public class Main {
	public static void main(String[] args)
	{
		int[] vector = new int[100000];
		VectorPopulate.init(vector);
		BubbleSort bubble = new BubbleSort();
		bubble.sort(vector);
		//bubble.show(vector);
	}
}