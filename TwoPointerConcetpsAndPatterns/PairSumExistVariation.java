package TwoPointerConcetpsAndPatterns;

public class PairSumExistVariation {
    public static void main(String[] args) {

        int []arr = {-3,0,1,3,6,8,11,14,18,25};
    }
    //Given N Distinct sorted element check if there exists a pair (i,j) such that arr[j]-arr[i] = k && k>0 && (i!=j)

    public static boolean isPairExist(int []arr,int k)
    {
        int p1=0,p2=1,n=arr.length;
        while(p2<n)
        {

            int diff = arr[p2]-arr[p1];
            if(diff>k)
            {
                p1++;
                if(p1==p2)p2++;
            }
            else if(diff<k) p2++;
            else return true;
        }
        return false;
    }
}
