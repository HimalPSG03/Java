import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class combi2 {

    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        Arrays.sort(arr);
        List<List<Integer>> result = combinationSum(arr, 8);
        System.out.println(result);
    }

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> res = new HashSet<>(); // Using a Set to avoid duplicates
        combinations(res, 0, candidates, target, new ArrayList<>());
        return new ArrayList<>(res); // Convert the Set back to a List
    }

    static void combinations(Set<List<Integer>> res, int index, int[] arr, int target, List<Integer> temp) {
        if (index == arr.length) {
            if (target == 0) {
                res.add(new ArrayList<>(temp));
            }
            return;
        }

        if (arr[index] <= target) {
            temp.add(arr[index]);
            combinations(res, index + 1, arr, target - arr[index], temp);
            temp.remove(temp.size() - 1);
        }
        combinations(res, index + 1, arr, target, temp);
    }
}
