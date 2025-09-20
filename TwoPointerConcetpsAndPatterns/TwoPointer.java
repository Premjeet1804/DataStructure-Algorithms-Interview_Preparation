package TwoPointerConcetpsAndPatterns;

public class TwoPointer {
    public static void main(String[] args) {

        System.out.println(isPairExist(new int[]{1,2,3,4,5,6,7,8},17));
    }
    //Given N distinct Sorted Elements check if there exists a pair(i,j) such that arr[i] + arr[j]==k i!=j
    public static boolean isPairExist(int []arr,int k)
    {
        int i=0,j=arr.length-1;
        while(i<j)
        {
            if(arr[i]+arr[j]>k)j--;
            else if(arr[i]+arr[j]<k) i++;
            else return true;
        }
        return false;
    }

}
