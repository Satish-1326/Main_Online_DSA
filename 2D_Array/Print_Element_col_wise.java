public class Print_Element_col_wise {
    public static void main(String[] args){
        int [][] arr = {
                {1,2,3,4},
                {7,8,5,8},
                {3,9,0,1}
        };
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][col - j - 1] + " ");
            }
            System.out.println();
        }
    }
}
