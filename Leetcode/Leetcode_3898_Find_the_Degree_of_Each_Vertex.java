import java.util.ArrayList;

public class Leetcode_3898_Find_the_Degree_of_Each_Vertex {
    public static void main(String[] args){
        int [][] arr = {
                {0,1,1},
                {1,0,1},
                {1,1,0}
        };

        int m = arr.length;
        int n = arr[0].length;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
            al.add(sum);
        }
        int [] result = new int[al.size()];
        int k = 0;
        for (int i = 0; i < al.size(); i++) {
            result[k] = al.get(i);
            k++;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
