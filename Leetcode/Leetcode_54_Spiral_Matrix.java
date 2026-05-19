import java.util.ArrayList;

public class Leetcode_54_Spiral_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16},
//                {17,18,19,20}
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}
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
                if(erow == srow){
                    break;
                }
                System.out.print(arr[erow][j] + " ");
            }
            for (int i = erow - 1; i >= srow + 1; i--) {
                if(scol == ecol){
                    break;
                }
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

class Leetcode_54_Spiral_Matrix_using_list_broot{
    public static void main(String[] args){
        int [][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int frow = 0;
        int fcol = 0;
        int lrow = arr.length - 1;
        int lcol = arr[0].length - 1;
        int total = arr.length * arr[0].length;

        int dir = - 1;
        while (total != 0){
            dir = (dir + 1) % 4 ;
            if(dir == 0){
                for (int j = fcol  ; j <= lcol; j++) {
                    System.out.print(arr[frow][j]+" ");
                    total--;
                }
                frow++;
            }
            if(dir == 1){
                for (int i = frow; i <= lrow; i++) {
                    System.out.print(arr[i][lcol]+" ");
                    total--;
                }
                lcol--;
            }
            if(dir == 2){
                for (int j = lcol; j >= fcol ; j--) {
                    System.out.print(arr[lrow][j]+" ");
                    total--;
                }
                lrow--;
            }
            if(dir == 3){
                for (int i = lrow; i >= frow; i--) {
                    System.out.print(arr[i][fcol]+" ");
                    total--;
                }
                fcol++;
            }
        }
    }
}
