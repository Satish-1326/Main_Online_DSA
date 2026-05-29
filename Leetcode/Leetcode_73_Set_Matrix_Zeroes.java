public class Leetcode_73_Set_Matrix_Zeroes {
    public static void main(String[] args){
        int [][] arr = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        boolean [] row = new boolean[rows];
        boolean [] col = new boolean[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(arr[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(row[i] || col[j]){
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

/*

OUTPUT :
1 0 1
0 0 0
1 0 1

 */
