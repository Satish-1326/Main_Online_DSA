public class Leetcode_27_Remove_Element {
    public static void main(String[] args){
        int [] arr = {3,2,2,3};
        int val = 3;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != val){
                arr[k] = arr[i];
                k = k + 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

/*

OUTPUT :

2 2 2 3

 */
