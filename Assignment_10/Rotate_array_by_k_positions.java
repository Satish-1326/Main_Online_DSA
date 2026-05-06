// LEFT ROTATE ARRAY BY K

public class Rotate_array_by_k_positions {
    public static void main(String[] args){
        int [] arr = {1, 2, 3, 4, 5};
        int k = 0;
        rotate(arr , k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotate(int [] arr , int k){
        reverse(arr , 0 , k);
        reverse(arr , k + 1 , arr.length - 1);
        reverse(arr , 0 , arr.length - 1);
    }
    public static void reverse(int [] arr , int start , int end){
        while(start < end){
            int temp = arr[start] ;
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}


