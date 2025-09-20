package TwoPointerConcetpsAndPatterns;

public class WaterAccumulation {
    public static void main(String[] args) {
        System.out.println(waterBetweenWalls(new int[]{3,7,4,5,2}));

    }
    public static int waterBetweenWalls(int []arr)
    {
        int i=0,j=arr.length-1;
        int ans=0;

        while(i<j)
        {
            int h = Math.min(arr[i],arr[j]);
            int storage = h*(j-i);
            ans = Math.max(storage,ans);

            if(arr[i]<arr[j]) i++;
            else j--;
        }
        return ans;
    }
}
