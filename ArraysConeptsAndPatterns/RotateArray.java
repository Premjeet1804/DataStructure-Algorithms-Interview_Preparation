package ArraysConeptsAndPatterns;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4},2);
    }

        public static void rotate (int[] nums, int k){
            int n = nums.length;
            if (k > n) k = k % n;
            reverse(nums, 0, n - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, n - 1);
            System.out.println(Arrays.toString(nums));
            return;
        }

        private static void reverse ( int[] A, int s, int e)
        {
            while (s < e) {
                swap(A, s, e);
                s++;
                e--;
            }
            return;
        }
        private static void swap(int []A, int i, int j)
        {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            return;
        }
    }
