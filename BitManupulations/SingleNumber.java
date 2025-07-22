package BitManupulations;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(singleNumberII(new int[]{1,1,2,2,3,3,4,7})));

    }
    //Every number is present twice except one
    private static int singleNumberI(int []arr)
    {
        int ans = 0;
        for(int el : arr)
        {
            ans^=el;
        }
        return ans;
    }
    //Every number is present two times except two numbers
    private static int[] singleNumberII(int []arr)
    {
        int n = arr.length;
        int num = 0;
        for(int el : arr) num^=el;

        int pos = -1;

        for(int i=0;i<=30;i++)
        {
            if((num>>i & 1) ==1) {
                pos = i;
                break;
            }
        }

        int set=0,unset=0;
        for(int i=0;i<n;i++)
        {

            if((arr[i]>>pos & 1) == 1) set^=arr[i];
            else unset^=arr[i];
        }
        return new int[]{set,unset};


    }

}
