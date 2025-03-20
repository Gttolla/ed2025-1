
public class Main {
	public static void main(String[] args)
	{
		int[] vector = {100,88,67,34,23,1, -1, -44, 30, -55};
		BubbleSort bubble = new BubbleSort();
		bubble.sort(vector);
		bubble.show(vector);
	}
}