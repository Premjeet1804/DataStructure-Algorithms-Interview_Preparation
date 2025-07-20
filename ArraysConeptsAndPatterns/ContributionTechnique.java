package ArraysConeptsAndPatterns;

public class ContributionTechnique {
    public static void main(String[] args) {
        //This technique is the efficient way of calculating the sum of all subarrays
        //In this we try to calculate the contribution of each element in the resultant sum
        System.out.println(contribution(new int[]{3,-2,4,-1,2,6}));

    }
    private static int contribution(int []arr)
    {
        int sum=0;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            sum = sum + (arr[i] * (i+1) * (n-i));
        }
        return sum;
    }
}
