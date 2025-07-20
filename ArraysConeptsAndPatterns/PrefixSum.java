package ArraysConeptsAndPatterns;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {

        prefix(new int[]{-3,6,2,4,5,2,8,-9,3,1});


    }
    private static void prefix(int []arr)
    {   int n = arr.length;
        int sum = arr[0];

        for(int i=1;i<n;i++)
        {
            arr[i] = arr[i] + arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
