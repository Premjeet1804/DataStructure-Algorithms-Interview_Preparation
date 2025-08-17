package ArraysConeptsAndPatterns.Problems;

public class TrappingRainWater {
    public static void main(String[] args) {

    }
    //https://leetcode.com/problems/trapping-rain-water/
    public int trap(int[] A) {
        int n = A.length;

        int []leftMax = new int[n];
        int []rightMax = new int[n];
        leftMax[0] = A[0];
        rightMax[n-1] = A[n-1];

        for(int i=1;i<n;i++) leftMax[i] = Math.max(leftMax[i-1],A[i]);

        for(int i=n-2;i>=0;i--) rightMax[i] = Math.max(A[i],rightMax[i+1]);

        int ans=0;

        for(int i=1;i<n-1;i++)
        {
            ans+=Math.min(leftMax[i],rightMax[i]) - A[i];
        }

        return ans;
    }
}
