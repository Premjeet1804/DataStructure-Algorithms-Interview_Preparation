package ArraysConeptsAndPatterns;

import java.util.ArrayList;
import java.util.List;

public class SubArrays {
    public static void main(String[] args) {
        //SubArray = Continous segment of an array.
        //Number of subarray in an array  = n*(n+1)/2;

        generateAllSubArrays(new int[]{1,2,3});
    }

    private static void generateAllSubArrays(int []arr)
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                List<Integer> subarray = new ArrayList<>();
                for(int k=i;k<=j;k++)
                {
                    subarray.add(arr[k]);
                }
                System.out.println(subarray);
            }
        }

    }
}
