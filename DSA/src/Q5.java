public class Q5 {
    public static void main(String[] args){
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int m = arr.length;
        int n = arr[0].length;


        System.out.print("Row sums : ");
        for(int i = 0 ; i < m ; i++){
            int sum = 0;
            for(int j = 0 ; j < n ; j++){
                sum += arr[i][j];
            }
            System.out.print(sum+" ");
        }
        System.out.println();
        System.out.print("Column sums : ");
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = 0; i < m; i++) {
                sum += arr[i][j];
            }
            System.out.print(sum+" ");
        }
    }
}

/*

OUTPUT :

Row sums : 6 15 24
Column sums : 12 15 18

 */
