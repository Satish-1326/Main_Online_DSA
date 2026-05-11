import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args){
        int [][] arr = {
                {1,2,3,4,5},
                {2,3,4,5,6},
                {3,4,5,6,7},
        };

        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[2][1]+" ");
            }
            System.out.println();
        }
    }
}

class prac {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
        };
        int row = arr.length;
        int col = arr[0].length;

        boolean result = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j] == 7){
                    result = true;
                    System.out.println(i +" : "+ j);
                }
            }
        }
        System.out.println(result);
    }
}

class Input_output{
    public static void main(String[] args){
        int [][] arr = new int[3][4]; // {{0,0,0,0} , {0,0,0,0} , {0,0,0,0}}

        System.out.println(arr.length);
        System.out.println(arr[0].length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class Input_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][4];

        System.out.print("Enter 12 elements : ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class Shallow_and_Deep_Copy{
    public static void main(String[] args){
        int [][] arr = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
        };
        int [][] brr = {
                {5, 2, 3, 3, 6},
                {7, 9, 0, 4, 6},
                {8, 1, 3, 1, 0},
        };
        arr[1][2] = 20;

        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr[0].length; j++) {
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
