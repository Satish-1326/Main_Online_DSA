public class Leetcode_240_Search_a_2D_Matrix_II {
    public static void main(String[] args){
        int [][] arr = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
        };
        int target = 7;
        boolean result = false;
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j] == target){
                    result = true;
                }
            }
        }
        System.out.println(result);
    }
}
