public class Sum_all_elements {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
        };

        int row = arr.length;
        int col = arr[0].length;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
