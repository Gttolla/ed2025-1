

public class Main {
    public static void main(String[] args) {
        int[] vector = {10,34,11,12,45,23,1,100,99,2};
        QuickSort quickSort = new QuickSort();
        quickSort.header(vector);
        quickSort.show(vector);
        quickSort.sort(vector, 0, vector.length);
        quickSort.show(vector);
    }
}


