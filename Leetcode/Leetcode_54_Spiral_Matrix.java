import java.util.ArrayList;

public class Leetcode_54_Spiral_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int m = arr.length;
        int n = arr[0].length;

        int srow = 0;
        int scol = 0;
        int erow = m - 1;
        int ecol = n - 1;


        while(srow <= erow && scol <= ecol) {
            for (int j = scol; j <= ecol; j++) {
                System.out.print(arr[srow][j] + " ");
            }
            for (int i = srow + 1; i <= erow; i++) {
                System.out.print(arr[i][ecol] + " ");
            }
            for (int j = ecol - 1; j >= scol; j--) {
                System.out.print(arr[erow][j] + " ");
            }
            for (int i = erow - 1; i >= srow + 1; i--) {
                System.out.print(arr[i][scol] + " ");
            }
            srow++;
            scol++;
            erow--;
            ecol--;
        }
    }
}
/*

OUTPUT :
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

*/

class Leetcode_54_Spiral_Matrix_using_list{
    public static void main(String[] args){
        int [][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int m = arr.length;
        int n = arr[0].length;

        int srow = 0;
        int scol = 0;
        int erow = m - 1;
        int ecol = n - 1;

        ArrayList<Integer> al = new ArrayList<>();

        while (srow <= erow && scol<= ecol){
            for (int j = srow; j <= ecol; j++) {
                al.add(arr[srow][j]);
            }
            for (int i = srow + 1; i <= erow ; i++) {
                al.add(arr[i][ecol]);
            }
            for (int j = ecol - 1; j >= scol ; j--) {
                al.add(arr[erow][j]);
            }
            for (int i = erow - 1; i >= srow + 1 ; i --) {
                al.add(arr[i][scol]);
            }
            srow++;
            scol++;
            erow--;
            ecol--;
        }
        System.out.println(al);
    }
}
