package StringsConecptsAndPatterns;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        reverseString("the sky is blue");


    }
    public static void reverseString(String str)
    {
        char []arr = str.trim().toCharArray();
        int n = arr.length;
        int i=0,j=arr.length-1;

        reverse(arr,i,j);
        j=0;
        while(j<n)
        {
            if(arr[j]==' ')
            {
                reverse(arr,i,j-1);
                while(arr[j] == ' ') j++;
                i=j;
            }
            j++;
        }
        reverse(arr,i,j-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(char []arr,int i,int j)
    {
        while(i<j)
        {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
    }
}
