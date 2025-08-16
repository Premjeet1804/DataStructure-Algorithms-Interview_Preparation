package ArraysConeptsAndPatterns;

public class KadanesAlgo {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));

    }
    public static int maxSubArray(int[] nums) {

        int sum=0;
        int max = nums[0];

        for(int el : nums)
        {
            sum+=el;
            if(sum>max) max = sum;
            if(sum<0) sum=0;
        }
        return max;
    }

}
