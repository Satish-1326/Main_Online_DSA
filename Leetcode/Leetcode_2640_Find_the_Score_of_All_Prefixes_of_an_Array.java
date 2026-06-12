public class Leetcode_2640_Find_the_Score_of_All_Prefixes_of_an_Array {
    public static void main(String[] args){
        int [] arr = {2,3,7,5,10};
        int [] result = Solution2640(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static int [] Solution2640(int [] arr){
        int n = arr.length;
        int [] ans = new int[n];

        int max = 0;
        int score = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
            score += arr[i] + max;
            ans[i] = score;
        }
        return ans;
    }
}
