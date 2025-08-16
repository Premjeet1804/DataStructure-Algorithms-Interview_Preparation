package SubSequenceAndSubsetConcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class GenerateSubsets {
    public static void main(String[] args) {
        List<HashSet<Integer>> list = generateSubset(new int[]{1,2,2});
        for(HashSet<Integer> l : list) System.out.println(l);
    }
    public static List<HashSet<Integer>> generateSubset(int []arr)
    {
        List<HashSet<Integer>> ans = new ArrayList<>();

        int n = arr.length;

        int limit = (int)Math.pow(2,n);

        for(int i=0;i<limit;i++)
        {
            HashSet<Integer> curr = new HashSet<>();
            for(int j=0;j<n;j++)
            {
                if(((i>>j) & 1) ==1) curr.add(arr[j]);
            }
            if(!ans.contains(curr)) ans.add(curr);
        }
        return ans;
    }
}
