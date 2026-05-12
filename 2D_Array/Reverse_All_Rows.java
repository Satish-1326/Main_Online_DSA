public class Reverse_All_Rows {
    public static void main(String[] args){
        int [][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,1,0,3},
                {5,2,0,4}
        };
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col / 2; j++) {
//                System.out.print(arr[i][col - j - 1] +" ");
                int temp = arr[i][j];
                arr[i][j] = arr[i][col-j-1];
                arr[i][col-j-1] = temp;
            }
        }
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                int temp = arr[i][j];
                arr[i][j] = arr[row - i - 1][j];
                arr[row - i - 1][j] = temp;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
