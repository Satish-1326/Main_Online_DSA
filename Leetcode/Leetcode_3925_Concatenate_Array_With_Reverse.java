public class Leetcode_3925_Concatenate_Array_With_Reverse {
    public static void main(String[] args){
        int [] arr = {1,2,3};
        int n = arr.length;

        int [] result = new int[n*2];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            result[k] = arr[i];
            k++;
        }
        for (int i = n - 1; i >= 0 ; i--) {
            result[k] = arr[i];
            k++;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}

class Leetcode_3925_Concatenate_Array_With_Reverse_2nd_app{
    public static void main(String[] args){
        int [] arr = {1,2,3};
        int n = arr.length;

        for (int i = n - 1; i < n*2; i++) {
            for (int j = n - 1; j >= 0 ; j++) {

            }
        }
    }
}
