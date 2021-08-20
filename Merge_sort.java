public class Merge_sort {

    static void Merge(int a[], int leftindex, int middle, int rightindex) {
        int n1 = middle - leftindex + 1;
        int n2 = rightindex - middle;

        int Left_array[] = new int[n1];
        int Right_array[] = new int[n2];

        for (int i = 0; i < n1; i++)
        {
            Left_array[i] = a[leftindex + i];
        }

        for (int j = 0; j < n2; j++)
        {
            Right_array[j] = a[middle + 1 + j];
        }

        int i = 0, j = 0, k = leftindex;
        while (i < n1 && j < n2)
        {
            if (Left_array[i] <= Right_array[j]) {
                a[k] = Left_array[i];
                i++;
            }
            else
                {
                a[k] = Right_array[j];
                j++;
            }
            k++;
        }
            while (i < n1)
            {
                a[k] = Left_array[i];
                i++;
                k++;
            }

            while (j < n2)
            {
                a[k] = Right_array[j];
                j++;
                k++;
            }

        }


    void sort(int a[], int leftindex, int rightindex) {
        if (leftindex < rightindex) {
            int middle = (leftindex + rightindex) / 2;
            sort(a, leftindex, middle);
            sort(a, middle + 1, rightindex);
            Merge(a, leftindex, middle, rightindex);
        }
    }




    public static void main(String []ar)
    {
       int a[] = {90,101,45,65,23,67,89,34};
        
        System.out.println("The Merge sort is  ");
        Merge_sort m =new Merge_sort();
        m.sort(a, 0,a.length-1);

        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }

    }
}
