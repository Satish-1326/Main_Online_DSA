public class Leetcode_3683_Earliest_Time_to_Finish_One_Task {
    public static void main(String[] args){
        int [][] tasks = {
                {1,6},
                {2,3}
        };
        System.out.println(earliestTime(tasks));
    }
    public static int earliestTime(int [][] tasks){
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < tasks.length; i++) {
            int sum = 0;
            for (int j = 0; j < tasks[i].length; j++) {
                sum += tasks[i][j];
            }
            ans = Math.min(sum,ans);
        }
        return ans;
    }
}
