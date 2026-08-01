public class Leetcode_3903_Smallest_Stable_Index_I {
    public static void main(String[] args){
        int [] arr = {5,0,1,4};
        System.out.println(firstStableIndex(arr,3));
    }
    public static int firstStableIndex(int [] arr , int k){
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            int max = arr[0];
            for (int j = 0; j <= i ; j++) {
                if(arr[j] > max){
                    max = arr[j];
                }
            }
            int min = arr[i];
            for (int j = i+1; j < n ; j++) {
                if(arr[j] < min){
                    min = arr[j];
                }
            }
            if(max - min <= k){
                return i;
            }
        }
        return -1;
    }
}
