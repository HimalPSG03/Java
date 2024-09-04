public class revArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};
        reverse(arr, arr.length, 0);

        for(int num : arr)
        {
            System.out.print(num+" ");
        }
    }

    static void reverse(int[] arr,int n,int i)
    {
        if(i>=n/2)
        { 
            return;
        }
        reverse(arr, n, i+1);
        int temp = arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        
        return;
    }
}
