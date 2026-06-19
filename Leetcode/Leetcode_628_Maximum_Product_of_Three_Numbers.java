public class Leetcode_628_Maximum_Product_of_Three_Numbers {
    public static void main(String[] args){
        int [] arr = {1,2,3,4};
        int result = maximumProduct(arr);
        System.out.println(result);
    }
    public static int maximumProduct(int [] arr){
        int n = arr.length;
        int prod = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                for (int k = j+1; k < n; k++) {
                    if(arr[i]*arr[j]*arr[k] > prod){
                        prod = arr[i]*arr[j]*arr[k];
                    }
                }
            }
        }
        return prod;
    }
}

// This solution gives TLE so i need to find better approach...

/*

        Arrays.sort(nums);

        int n = nums.length;

        int prod = nums[n-1]*nums[n-2]*nums[n-3];
        int prod2 = nums[0]*nums[1]*nums[n-1];

        return Math.max(prod,prod2);


 */