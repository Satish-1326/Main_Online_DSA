public class Leetcode_59_Spiral_Matrix_II {
    public static void main(String[] args){
        int [] [] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int m = arr.length;
        int n = arr[0].length;
        int f_row = 0;
        int f_col = 0;
        int l_row = m - 1;
        int l_col = n - 1;

        int var = m * n;

        while (f_row <= l_row && f_col <= l_col) {
            for (int j = f_col; j <= l_col; j++) {
                System.out.print(arr[f_row][j] + " ");
            }
            for (int i = f_row + 1; i <= l_row; i++) {
                System.out.print(arr[i][l_col] + " ");
            }
            for (int j = l_col - 1; j >= f_col; j--) {
                System.out.print(arr[l_row][j] + " ");
            }
            for (int i = l_row - 1; i >= f_row + 1; i--) {
                System.out.print(arr[i][f_col]+" ");
            }
            f_row++;
            f_col++;
            l_row--;
            l_col--;
        }
    }
}

// BUT IN THE MAIN QUESTION THEY GIVE ONLY THE SIZE OF THE MATRIX
// EX n = 3;

class Leetcode_59_Spiral_Matrix_II_main_prob{
    public static void main(String[] args){
        int n = 3;

        int[][] arr = new int[n][n];
        int val = 1;

        int f_row = 0;
        int f_col = 0;
        int l_row = n - 1;
        int l_col = n - 1;

        while(f_row <= l_row && f_col <= l_col) {
            for (int j = f_col; j <= l_col; j++) {
                arr[f_row][j] = val++;
                System.out.print(arr[f_row][j] + " ");
            }
            for (int i = f_row + 1; i <= l_row; i++) {
                arr[i][l_col] = val++;
                System.out.print(arr[i][l_col] + " ");
            }
            for (int j = l_col - 1; j >= f_col; j--) {
                arr[l_row][j] = val++;
                System.out.print(arr[l_row][j] + " ");
            }
            for (int i = l_row - 1; i >= f_row + 1; i--) {
                arr[i][f_col] = val++;
                System.out.print(arr[i][f_col] + " ");
            }
            f_row++;
            f_col++;
            l_row--;
            l_col--;
        }
    }
}

/*

OUTPUT :
1 2 3 4 5 6 7 8 9

PERFECTLY SOLVED
 */