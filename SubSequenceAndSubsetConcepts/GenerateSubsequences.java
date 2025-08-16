package SubSequenceAndSubsetConcepts;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubsequences {
    public static void main(String[] args) {

        List<List<Integer>> list = generateSequence(new int[]{1,2,3});
        for(List<Integer> l : list) System.out.println(l);

    }
    private static List<List<Integer>> generateSequence(int []arr)
    {
        int n = arr.length;
        int total = (int)Math.pow(2,n);
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<total;i++)
        {
            List<Integer> curr = new ArrayList<>();
           for(int j=0;j<n;j++){
               if(((i>>j) & 1) == 1) curr.add(arr[j]);

           }
           ans.add(curr);
        }
        return ans;
    }
}
