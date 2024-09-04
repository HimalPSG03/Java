import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,5,1,5,6,7,8,9,0};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

   static void sort(int[] arr , int low, int high)
    {
        if(low < high)
        {
            int parti = partition(arr,low,high);
            sort(arr,low,parti-1);
            sort(arr,parti+1,high);
        }
    }
    static int partition(int[] arr , int low, int high)
    {
        int pivot=arr[low];
        int i = low;
        int j = high;
        while(i<j)
        {
            while(arr[i] <= pivot && i <= high-1 )
            {
                i++;
            }
            while(arr[j] > pivot && j >= low+1 )
            {
                j--;
            }
            if(j>i)
            {
                int temp = arr[j];
                arr[j]= arr[i];
                arr[i]=temp;
            }
        }
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;
    }
}
