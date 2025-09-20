package TwoPointerConcetpsAndPatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllTriplets {
    public static void main(String[] args) {
        System.out.println(triplets(new int[]{-1,0,1,2,-1,4}));

    }
    //find a triplet a,b,c such that a+b+c=0, find all unique and must be in increasing order (a<b<c)
    public static List<List<Integer>> triplets(int []arr)
    {
        List<List<Integer>> ans=  new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);

        for(int i=0;i<n;i++)
        {
            if(i>0 && arr[i]==arr[i-1]) continue;
            int sum = -(arr[i]);
            int p1=i+1;
            int p2 = n-1;

            while(p1<p2) {
                int currSum = arr[p1] + arr[p2];
                if (currSum < sum) p1++;
                else if (currSum > sum) p2--;
                else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(p1);
                    temp.add(p2);
                    if (!ans.contains(temp)) ans.add(temp);
                    p1++;
                    while(p1<p2 && arr[p1]==arr[p2]) p1++;
                }

            }
        }
        return ans;

    }
}
