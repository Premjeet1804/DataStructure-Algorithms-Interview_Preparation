package TwoDimensionalArrays;

public class SearchInMatrix {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(search(arr,11));
    }
    public static boolean search(int [][]mat,int target)
    {
        int row=0;
        int col = mat[0].length-1;

        while(row < mat.length && col>=0)
        {
            if(mat[row][col] < target)
            {
                row++;
            }
            else if(mat[row][col]>target)
            {
                col--;
            }
            else if(mat[row][col] == target) return true;
        }
        return false;
    }
}
