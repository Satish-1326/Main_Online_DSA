public class Rotate_Image {
    public static void main(String[] args){
        int [][] arr = {
                {2, 8, 3, 4},
                {7, 2, 1, 6},
                {5, 5, 4, 1},
                {3, 1, 8, 2}
        };
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < row; i++) {
            int start = 0;
            int end = arr[0].length - 1;
            while (start < end){
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
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

/*

OUTPUT :
3 5 7 2
1 5 2 8
8 4 1 3
2 1 6 4

 */