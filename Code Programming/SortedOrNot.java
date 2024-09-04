public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};
        if(shorted(arr, 0))
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }

    static boolean shorted(int[] arr, int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return shorted(arr, i+1);
    }
}
