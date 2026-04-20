public class Right_rotate_array {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        int last = arr[arr.length-1];
        int k = 1;

        int [] temp = new int[arr.length];
        for (int i = arr.length-1 ; i > 0; i--) {
            arr[i] = arr[i-1];
        }

        arr[0] = last;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
