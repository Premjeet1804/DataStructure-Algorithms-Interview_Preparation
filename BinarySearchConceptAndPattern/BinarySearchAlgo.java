package BinarySearchConceptAndPattern;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9};
        int target = 9;
        System.out.println(binarySearch(arr,target));

    }

    public static int binarySearch(int []arr,int target)
    {
        int s = 0;
        int e = arr.length-1;


        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(arr[mid]<target)
            {
                s=mid+1;
            }
            else if(arr[mid]>target)
            {
                e=mid-1;
            }
            else return mid;
        }
        return -1;
    }


}
