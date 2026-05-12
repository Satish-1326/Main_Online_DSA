public class Transpose_of_Matrix {
    public static void main(String[] args){
        int [][] arr = {
                {2,8,3,4},
                {7,2,1,6},
                {5,5,4,1},
                {3,1,8,2}
        };

        print(arr);

        System.out.println("----------------");
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
    }
    public static void print(int [][] arr){
        int row = arr.length;
        int col = arr[0].length;

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
2 8 3 4
7 2 1 6
5 5 4 1
3 1 8 2
----------------
2 7 5 3
8 2 5 1
3 1 4 8
4 6 1 2

 */