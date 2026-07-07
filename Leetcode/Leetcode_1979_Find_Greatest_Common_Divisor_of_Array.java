public class Leetcode_1979_Find_Greatest_Common_Divisor_of_Array {
    public static void main(String[] args){
        int [] arr = {2,5,6,9,10};
        System.out.println(findGCD(arr));
    }
    public static int findGCD(int [] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        while (max != 0){
            int temp = max;
            max = min % max;
            min = temp;
        }
        return min;
    }
}
