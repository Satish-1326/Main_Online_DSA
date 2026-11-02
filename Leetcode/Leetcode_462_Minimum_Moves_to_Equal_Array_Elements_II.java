public class Leetcode_462_Minimum_Moves_to_Equal_Array_Elements_II {
    public static void main(String[] args){
        int [] nums = {1,2,3};

        System.out.println(minMoves2(nums));
    }
    public static int minMoves2(int [] nums){
        int mediun = nums[nums.length / 2];
        int moves = 0;

        for (int i = 0; i < nums.length; i++) {
            moves += Math.abs(nums[i] - mediun);
        }
        return moves;
    }
}
