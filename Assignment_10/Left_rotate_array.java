public class Left_rotate_array {
    public static void main(String[] args){
        int [] arr = {1, 2, 3, 4, 5};
        int start = arr[0];


        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = start;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
/*

OUTPUT :

2 3 4 5 1

 */
