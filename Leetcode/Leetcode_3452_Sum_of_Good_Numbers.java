public class Leetcode_3452_Sum_of_Good_Numbers {
    public static void main(String[] args){
        int [] arr = {1,3,2,1,5,4};
        System.out.println(sumOfGoodNumbers(arr,2));
    }
    public static int sumOfGoodNumbers(int [] arr , int k){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean good = true;
            if(i - k >= 0 && arr[i] <= arr[i-k]){
                good = false;
            }
            if(i + k < arr.length && arr[i] <= arr[i+k]){
                good = false;
            }
            if (good){
                sum += arr[i];
            }
        }
        return sum;
    }
}
