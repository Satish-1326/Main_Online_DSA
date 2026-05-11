public class Max_from_2D_Array {
    public static void main(String[] args){
        int [][] arr = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
        };
        int row = arr.length;
        int col = arr[0].length;
        int max = arr[0][0];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
