public class Leetcode_2733_Neither_Minimum_nor_Maximum {
    public static void main(String[] args){
        int [] arr = {3,2,1,4};
        int f_min = Integer.MAX_VALUE;
        int l_max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < f_min){
                f_min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > l_max){
                l_max = arr[i];
            }
        }

        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != f_min && arr[i] != l_max){
                result = arr[i];
            }
        }
        System.out.println(result);
    }
}
