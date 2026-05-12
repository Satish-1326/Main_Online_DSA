public class Q_Matrix_In_Snake_Pattern {
    public static void main(String[] args){
        int [][] arr = {
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 6},
        };
        int row = arr.length;
        int col = arr[0].length;

        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                if( j  % 2 == 0){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print(arr[row - i - 1][j]+" ");
                }
            }
        }
    }
}

/*

OUTPUT:
1 2 3 4 3 2 3 4 5 6 5 4

 */
