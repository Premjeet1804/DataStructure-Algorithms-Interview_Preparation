package ArraysConeptsAndPatterns;

public class SlidingWindow {
    public static void main(String[] args) {
        System.out.println(maxSubArrayOfSizeK(new int[]{-3,4,-2,5,3,-2,8,2,-1,4},6));


    }
    private static int maxSubArrayOfSizeK(int []arr,int k)
    {
        int sum=0;
        int n = arr.length;
        for(int i=0;i<k;i++) sum+=arr[i];
        int max = sum;

        for(int i=k;i<n;i++)
        {
            sum = sum - arr[i-k] + arr[i];
            max = Math.max(max,sum);
        }
        return max;

    }

}