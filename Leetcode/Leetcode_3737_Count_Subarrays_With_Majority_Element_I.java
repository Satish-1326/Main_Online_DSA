public class Leetcode_3737_Count_Subarrays_With_Majority_Element_I {
    public static void main(String[] args){
        int [] arr = {1,2,2,3};
        System.out.println(countMajoritySubarrays(arr,2));
    }
    public static int countMajoritySubarrays(int [] arr , int target){
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int freq = 0;
            for (int j = i; j < n; j++) {
                if(arr[j] == target){
                    freq++;
                }

                int len = j - i + 1;
                if(freq > len/2){
                    count++;
                }
            }
        }
        return count;
    }
}
