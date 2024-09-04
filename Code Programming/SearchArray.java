public class SearchArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,5,4,3,2,3,4,5,7,8,66,4,3,2,78,5,6,0};
        if(check(arr, 0, 9)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }

    static boolean check(int[] arr, int i,int target)
    {
        if(i==arr.length)
        {
            return false;
        }
        if(arr[i]==target){
            return true;
        }
        return check(arr, i+1, target);
    }
}
