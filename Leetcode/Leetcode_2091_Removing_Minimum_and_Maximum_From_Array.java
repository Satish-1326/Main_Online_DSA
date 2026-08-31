public class Leetcode_2091_Removing_Minimum_and_Maximum_From_Array {
    public static void main(String[] args){
        int [] nums = {2,10,7,5,4,1,8,6};
        System.out.println(minimumDeletions(nums));
    }
    public static int minimumDeletions(int [] nums){
        int n = nums.length;

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            if(nums[i] < nums[minIndex]){
                minIndex = i;
            }
            if(nums[i] > nums[maxIndex]){
                maxIndex = i;
            }
        }

        if(minIndex > maxIndex){
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }

        int front = maxIndex+1;
        int back = n - minIndex;

        int both = (minIndex +1) + (n - maxIndex);

        return Math.min(front , Math.min(back , both));
    }
}
