public class Leetcode_3936_Minimum_Swaps_to_Move_Zeros_to_End {
    public static void main(String[] args){
        int [] arr = {0,1,0,3,12};
        int result = Solution3936(arr);
        System.out.println(result);
    }
    public static int Solution3936(int [] arr){
        int start = 0;
        int end = arr.length-1;
        int count = 0;

        while (start < end){
            if(arr[start] == 0 && arr[end]!= 0){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                count++;
                start++;
                end--;
            }else if(arr[end] == 0){
                end--;
            }else if(arr[start] != 0){
                start++;
            }
        }
        return count;
    }
}
