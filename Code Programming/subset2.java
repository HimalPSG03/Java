import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset2 {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        subsetsWithDup(nums);
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        subset(nums,0,new ArrayList<Integer>(),res);
        System.out.println(res);
        return res;
    }
    public static void subset(int[] nums,int count,List<Integer> temp,List<List<Integer>> res)
    {
        res.add(new ArrayList<Integer>(temp));
        for(int i=count;i<nums.length;i++)
        {
            if(i!=count && nums[i]==nums[i-1])
            {
                continue;
            }
            temp.add(nums[i]);
            subset(nums,i+1,temp,res);
            temp.remove(temp.size()-1);

        }
    }
}
