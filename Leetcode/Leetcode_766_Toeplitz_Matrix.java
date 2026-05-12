public class Leetcode_766_Toeplitz_Matrix {
    public static void main(String[] args){
        int [][] arr = {
                {1,2,3,4},
                {5,1,2,3},
                {9,5,1,2}
        };
        int row = arr.length;
        int col = arr[0].length;

        boolean Toeplitz_Matrix = true;
        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < col - 1; j++) {
                if(arr[i][j] != arr[i+1][j+1]){
                    Toeplitz_Matrix = false;
                }
            }
        }
        System.out.println(Toeplitz_Matrix);
    }
}

/*

OUTPUT :
Accepted
483 / 483 testcases passed

 */
