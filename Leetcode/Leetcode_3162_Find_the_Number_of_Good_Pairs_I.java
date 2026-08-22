public class Leetcode_3162_Find_the_Number_of_Good_Pairs_I {
    public static void main(String[] args){
        int [] nums1 = {1,3,4};
        int [] nums2 = {1,3,4};
        System.out.println(numberOfPairs(nums1,nums2,1));
    }
    public static int numberOfPairs(int [] nums1, int [] nums2, int k){
        int count = 0;

        int n = nums1.length;
        int m = nums2.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(nums1[i] % (nums2[j]*k) == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
