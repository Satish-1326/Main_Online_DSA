public class Leetcode_1920_Build_Array_from_Permutation {
    public static void main(String[] args) {
        int[] arr = {5,0,1,2,3,4};
        int[] result = new int[arr.length];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            result[k] = arr[arr[i]];
            k++;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
