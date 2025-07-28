package HashingConceptAndPatterns;

import java.util.HashMap;
import java.util.HashSet;

public class MapConcepts {
    public static void main(String[] args) {
        int []arr = {1,2,4,3,5,7,6,8,4,56,2,3,5,7,1,4};
        int []queries = {1,2,3,4,56,7,8};
//        countFreq(arr,queries);
//        System.out.println(firstNonRepeatingEle(arr));
    }
    //Given an array and Q queries for each query return frequency of an element.
    public static void countFreq(int []arr,int []queries)
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int el : arr)
        {
            map.put(el,map.getOrDefault(el,0)+1);
        }
        for(int q : queries)
        {
            int freq = map.get(q);
            System.out.println(q+"->"+freq);
        }
    }
    //Given an array find first non-repeating element
    public static int firstNonRepeatingEle(int []arr)
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int el : arr)
        {
            map.put(el,map.getOrDefault(el,0)+1);
        }
        for(int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }
    //https://leetcode.com/problems/two-sum/description/
    //Two Sum
    public static int[]  twoSum(int[] arr,int k)
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int el : arr)
        {
            map.put(el,map.getOrDefault(el,0)+1);
        }
        int num1=0,num2=0;
        for(int el : map.keySet())
        {
            int x = k-el;
            if(map.containsKey(x))
            {
                if(x==el && map.get(el)==2)
                {
                    num1=el;
                    num2=x;
                }
                else
                {
                    num1=el;
                    num2=x;
                }
            }
        }
        int i=0,j=0;

        for( i=0;i<arr.length;i++)
        {
            if(arr[i]==num1) break;
        }
        for(j=0;j<arr.length;j++)
        {
            if(i!=j && arr[j]==num2) break;
        }
        return new int[]{i,j};


    }
    //https://www.geeksforgeeks.org/dsa/count-distinct-elements-in-every-window-of-size-k/
    private static int[] countDistinct(int []arr,int k)
    {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int j=0;
        for(int i=0;i<k;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int []ans = new int[n-k+1];
        ans[j++] = map.size();
        for(int i=k;i<n-k;i++)
        {
            int prev = arr[i-k];
            int curr = arr[i];
            map.put(prev,map.get(prev)-1);
            if(map.get(prev)==0) map.remove(prev);
            map.put(curr, map.getOrDefault(curr,0)+1);

            ans[j++]=map.size();
        }


    }
}
