public class Transpose_of_Matrix_Using_new_Matrix {
    public static void main(String[] args){
        int [][] arr = {
                {2,8,3,4},
                {7,2,1,6},
                {5,5,4,1}
        };

        int row = arr.length;
        int col = arr[0].length;
        int [][] ans = new int[col][row];

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
