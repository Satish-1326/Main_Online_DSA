import java.util.PriorityQueue;

public class Leetcode_378_Kth_Smallest_Element_in_a_Sorted_Matrix {
    public static void main(String[] args){
        int [][] matrix = {
                {1,5,9},
                {10,11,13},
                {12,13,15}
        };

        System.out.println(kthSmallest(matrix,8));
    }
    public static int kthSmallest(int [][] matrix , int k){

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                pq.offer(matrix[i][j]);
            }
        }
        for (int i = 1; i < k; i++) {
            pq.poll();
        }

        return pq.peek();
    }
}
