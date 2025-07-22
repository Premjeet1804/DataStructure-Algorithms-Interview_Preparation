package TwoDimensionalArrays;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        transpose(arr);
    }
    //In place Transpose of a matrix (iterating of upper triangle)
    private static void transpose(int [][]arr)
    {
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0;i<m-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int []A : arr)
        {
            System.out.println(Arrays.toString(A));
        }
    }
}
