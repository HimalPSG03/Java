import java.util.ArrayList;
import java.util.List;

public class print_subset {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        ss(arr,0,0,new ArrayList<>());
    }
    static void ss(int[] arr, int sum,int index,List<Integer> temp)
    {
        if(index==arr.length)
        {
            System.out.println(temp);
            System.out.println(sum);
            return;
        }
        temp.add(arr[index]);
        ss(arr,sum+arr[index],index+1,temp);
        temp.remove(temp.size()-1);
        ss(arr,sum,index+1,temp);
    }
}
