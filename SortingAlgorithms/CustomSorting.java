package SortingAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class CustomSorting {
    public static void main(String[] args) {

        Integer []arr = {8,12,15,16,14,21,24};

        Arrays.sort(arr,(a, b) -> {
            if (custom(a, b)) return -1;
            else if (custom(b, a)) return 1;
            else return 0;
        });
        System.out.println(Arrays.toString(arr));

    }
    //sort array on the number of factors

    public static boolean custom(int a,int b)
    {
        int fa = factors(a);
        int fb = factors(b);

        if(fa<fb) return true;
        else return fa == fb && a < b;

    }
    public static int factors(int n)
    {
        int count=0;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0 && (n%(n/i)==0)) count+=2;
            else if(n%i==0) count++;
        }
        return count;
    }

}
