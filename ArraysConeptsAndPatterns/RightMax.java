package ArraysConeptsAndPatterns;

import java.util.Arrays;

public class RightMax {
    public static void main(String[] args) {
        RightMax(new int[]{4,3,8,2,3,1});

    }
    public static void RightMax(int []A)
    {
        int n = A.length;

        for(int i=n-2;i>=0;i--)
        {
            A[i] = Math.max(A[i],A[i+1]);
        }
        System.out.println(Arrays.toString(A));
    }
}
