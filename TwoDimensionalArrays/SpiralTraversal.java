package TwoDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversal {
    public static void main(String[] args) {
//        int [][]arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int [][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiral(arr));
    }
    public static List<Integer> spiral(int [][]mat)
    {
        int m = mat.length;
        int n = mat[0].length;
        int i=0,j=0;
        List<Integer> list = new ArrayList<>();

        while(m>1 && n>1)
        {
            for(int l=1;l<n;l++)
            {
                  list.add(mat[i][j]);
                  j++;
            }
            for(int l=1;l<m;l++)
            {
                list.add(mat[i][j]);
                i++;

            }
            for(int l=1;l<n;l++)
            {
                list.add(mat[i][j]);
                j--;
            }
            for(int l=1;l<m;l++)
            {
                list.add(mat[i][j]);
                i--;
            }
            m-=2;
            n-=2;
            i++;j++;
        }

        if(m==1 && n==1) list.add(mat[i][j]);
        else if(n==1)
        {
            for(int l=1;l<=m;l++)
            {
                list.add(mat[i][j]);
                i++;
            }
        }
        else if(m==1)
        {
            for(int l=1;l<=n;l++)
            {
                list.add(mat[i][j]);
                j++;
            }
        }
        return list;
    }
}
