package ArraysConeptsAndPatterns;

import java.util.Arrays;

public class LeftMax {
    public static void main(String[] args) {

        generateLeftMaxima(new int[]{1,5,3,6,9,3,2,1});

    }
    private static void generateLeftMaxima(int []A)
    {
        int n = A.length;
        for(int i=1;i<n;i++)
        {
            A[i]=Math.max(A[i-1],A[i]);
        }

        System.out.println(Arrays.toString(A));
    }
}
