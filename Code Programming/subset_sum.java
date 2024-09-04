public class subset_sum {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        ss(arr,0,0);

    }
    static void ss(int[] arr, int sum,int index)
    {
        if(index==arr.length)
        {
            System.out.println(sum);
            return;
        }
        ss(arr,sum+arr[index],index+1);
        ss(arr,sum,index+1);
    }
}
