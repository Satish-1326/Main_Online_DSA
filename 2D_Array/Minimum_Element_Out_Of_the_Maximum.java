public class Minimum_Element_Out_Of_the_Maximum {
    public static void main(String[] args){
        int [][] arr = {
                {1, 2, 3, 4, 11},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
        };
        int min = Integer.MAX_VALUE;
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            int max = 0;
            for (int j = 0; j < col; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            if(max < min){
                min = max;
            }
        }
        System.out.println("Minimum from maximum elements : "+min);
    }
}

/*

OUTPUT :
Minimum from maximum elements : 6

 */
