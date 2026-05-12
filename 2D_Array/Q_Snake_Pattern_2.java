public class Q_Snake_Pattern_2 {
    public static void main(String[] args){
        int [][] arr = {
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 6},
        };
        // 1 2 3 4 5 4 3 2 3 4 5 6
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(i % 2 == 0){
                    System.out.print(arr[i][j]+" ");
                }else{
                    System.out.print(arr[i][col-j-1]+" ");
                }
            }
//            System.out.println();
        }
    }
}

/*

OUTPUT :
1 2 3 4 5 4 3 2 3 4 5 6



1 2 3 4
5 4 3 2
3 4 5 6
 */

class Q_Snake_Pattern_2_Approach_tow{
    public static void main(String[] args){
        int [][] arr = {
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 6},
        };
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            if(i % 2 == 0){
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }else{
                for(int j = col - 1 ; j >= 0 ; j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}

/*

OUTPUT :
1 2 3 4 5 4 3 2 3 4 5 6

1 2 3 4
5 4 3 2
3 4 5 6

 */