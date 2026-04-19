public class leetcode_268_missing_number {
    public static void main(String[] args){
        int [] arr = {9,6,4,2,3,5,7,0,1};
        Solution268 solution268 = new Solution268();

        System.out.print("Missing number from the array : ");
        System.out.print(solution268.missingNumber(arr));

    }
}
class Solution268{
    public int missingNumber(int [] arr){
        int n = arr.length;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        int actual_sum = n*(n+1)/2;
        int result = actual_sum - sum;
        return result;
    }
}

/*

OUTPUT :

Missing number from the array : 8

 */
