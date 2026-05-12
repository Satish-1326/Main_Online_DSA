public class Lecture {
    public static void main(String[] args){
        int [][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,12,15,16}
        };
        int row = arr.length;
        int col = arr[0].length;

        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class Lecture1{
    public static void main(String[] args){
        int [][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int row = arr.length;
        int col = arr[0].length;

        for (int j = 0; j < col; j++) {
            System.out.print(arr[0][j]+" ");
        }
        for (int i = 1; i < row; i++) {
            System.out.print(arr[i][col - 1]+" ");
        }
        for(int j = col - 2 ; j >= 0 ; j--){
            System.out.print(arr[row - 1][j]+" ");
        }
        for(int i = row - 2 ; i > 0 ; i--){
            System.out.print(arr[i][0]+" ");
        }
    }
}

/*

OUTPUT :
1 2 3 4 8 12 16 15 14 13 9 5

 */

class Lecture_Q3{
    public static void main(String[] args){
        int [][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(i % 2 == 0){
                    System.out.print(arr[i][j]+" ");
                }else{
                    System.out.print(arr[i][row - 1 - j]+" ");
                }
            }
            System.out.println();
        }
    }
}

/*

OUTPUT :
1 2 3 4
8 7 6 5
9 10 11 12
16 15 14 13

 */

class Lecture_Q4{
    public static void main(String[] args){
        int [][] arr = {
                {1,2,3},
                {4,5,6}
        };

        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
/*

OUTPUT :
1 4
2 5
3 6

 */

class Lecture_Q5{
    public static void main(String[] args){
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
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
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        for (int i = 0; i < row; i++) {
            int start = 0 ;
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
1 4 7
2 5 8
3 6 9
---------------------
7 4 1
8 5 2
9 6 3

 */
