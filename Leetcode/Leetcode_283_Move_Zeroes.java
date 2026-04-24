public class Leetcode_283_Move_Zeroes {
    public static void main(String[] args){
        int [] arr = {0,1,0,3,12};
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

/*

OUTPUT :

1 3 12 0 0

 */
