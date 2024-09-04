import java.util.ArrayList;
import java.util.List;

public class ss {

    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        List<List<Integer>> result = combinationSum(arr, 7);
        System.out.println(result);
    }
    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        combinations(res,0,candidates,target,new ArrayList<>());
        return res;
    }
    static void combinations(List<List<Integer>> res, int index, int[] arr, int target,List<Integer> temp)
    {   if(index==arr.length)
        {
        if(target==0)
        {
            res.add(new ArrayList<>(temp));
        }
            return;
        }
        

        if(arr[index] <= target)
        {   
            temp.add(arr[index]);
            combinations(res,index,arr,target-arr[index],temp);
            temp.remove(temp.size() - 1);
        }
        combinations(res,index+1,arr,target,temp);
    }
}