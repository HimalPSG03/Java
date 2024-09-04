import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 5, 2, 1, 4, 6, 7, 8, 4, 6};
        merge_Sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void merge_Sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        merge_Sort(arr, low, mid);
        merge_Sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int index = 0;
        int start = low;
        int end = mid + 1;

        while (start <= mid && end <= high) {
            if (arr[start] > arr[end]) {
                temp[index++] = arr[end++];
            } else {
                temp[index++] = arr[start++];
            }
        }

        while (start <= mid) {
            temp[index++] = arr[start++];
        }

        while (end <= high) {
            temp[index++] = arr[end++];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }
}
