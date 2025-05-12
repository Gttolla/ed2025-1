
public class QuickSort {

    public void sort(int values[], int begin, int end)
    {
        if (begin >= end - 1) return; 

        int i = begin, j = end - 1;
        int pivo = values[begin + (end - begin) / 2];

        while (i <= j)
        {
            while (i < end && values[i] < pivo)
            {
                i++;
            }

            while (j >= begin && values[j] > pivo)
            {
                j--;
            }

            if (i <= j)
            {
                swap(values,i,j);
                show(values,i,j);
                i++;
                j--;
            }
        }
        show(values);
        if (begin < j)
            sort(values, begin, j + 1);
        if (i < end)
            sort(values, i, end);
    }

    public void show(int[] vector, int a, int b)
    {
        for (int i=0; i < vector.length; i++)
        {
            if (i == a || i == b)
                System.out.printf("%4d", vector[i]);
            else 
                System.out.printf("    ");
        }
        System.out.println();     
    }

    public void show(int[] vector)
    {
        for (int i=0; i < vector.length; i++)
        {
            System.out.printf("%4d", vector[i]);
        }
        System.out.println();
    }

    private void swap(int[] values, int i, int j)
    {
        int aux = values[i];
        values[i] = values[j];
        values[j] = aux;
    }

    public void header(int[] values)
    {
        for (int i=0; i < values.length; i++)
        {
            System.out.printf("%4d", i);
        }
        System.out.println();
    }
}