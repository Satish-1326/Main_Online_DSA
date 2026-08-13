public class Leetcode_3736_Minimum_Moves_to_Equal_Array_Elements_III {
    public static void main(String[] args){
        int [] arr = {2,1,3};
        System.out.println(minMoves(arr));
    }
    public static int minMoves(int [] arr){
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];

            while (ele < max){
                ele++;
                count++;
            }
        }
        return count;
    }
}
