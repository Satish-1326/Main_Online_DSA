public class Leetcode_1288_Remove_Covered_Intervals {
    public static void main(String[] args){
        int [][] arr = {
                {1,4},
                {3,6},
                {2,8}
        };

        System.out.println(removeCoveredIntervals(arr));
    }
    public static int removeCoveredIntervals(int [][] arr){
        int covered = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i == j){
                    continue;
                }

                if(arr[j][0] <= arr[i][0] && arr[i][1] <= arr[j][1]){
                    covered++;
                    break;
                }
            }
        }
        return arr.length-covered;
    }
}
