import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        System.out.println(maximumUniqueSubarray(new int[]{4,2,4,5,6}));
        System.out.println(zeroFilledSubarray(new int[]{0,0,0,2,0,0}));
    }
    public static long zeroFilledSubarray(int[] nums) {
        int n = nums.length;
        long ans=0;
        int zero=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0) zero++;
            else {
                if(zero>0) ans+=((long)zero*(zero+1)/2);
                zero=0;
            }
        }
        if(zero>0) ans+=((long)zero*(zero+1)/2);
        return ans;

    }
}
