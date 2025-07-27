import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        System.out.println(maximumUniqueSubarray(new int[]{4,2,4,5,6}));
        System.out.println(windows(new int[]{1,3,-1,-3,5,3,6,7},3));
    }
    public static int maximumUniqueSubarray(int[] nums) {

      int ans = 0,sum=0;
      int low=0,high=0;
      int n=nums.length;

      Set<Integer> set = new HashSet<>();
      while(high<n)
      {
          if(!set.contains(nums[high]))
          {
              sum+=nums[high];
              set.add(nums[high]);
              high++;
          }
          else {
              while(low<n && set.contains(nums[high])) {
                  set.remove(nums[low]);
                  sum -= nums[low];
                  low++;
              }
          }
          ans = Math.max(sum,ans);

      }
      return ans;

    }

    private static List<Integer> windows(int []nums,int k)
    {
        int max = nums[0];
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<=nums.length-k;i++)
        {
               int j=0;
               while(j<k)
               {
                   max = Math.max(max,nums[i+j]);
                   j++;
               }
               list.add(max);
               max=0;
        }
        return list;

    }
}
