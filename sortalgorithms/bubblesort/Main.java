
public class Main {
	public static void main(String[] args)
	{
		int[] vector = {100,88,5,67,34,23,1,4,10,15};
		BubbleSort bubble = new BubbleSort();
		bubble.sort(vector);
		bubble.show(vector);
	}
}