public class Leetcode_1929_Concatenation_of_Array {
    public static void main(String[] args){
        int [] arr = {1,2,1};
        int n = arr.length;
        int [] result = new int[n*2];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            result[k] = arr[i];
            k++;
        }
        for (int i = 0; i < arr.length; i++) {
            result[k] = arr[i];
            k++;
        }
    }
}
