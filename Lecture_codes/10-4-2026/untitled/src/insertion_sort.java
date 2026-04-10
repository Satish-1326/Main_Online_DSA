public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {7, 3, 5, 2, 6};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int c_i = arr[i];
            int left = i - 1;

            while(left >= 0 && arr[left] > c_i){
                arr[left+1] = arr[left];
                left--;
            }
            arr[left+1] = c_i;
        }

        System.out.print("Array after applying the insertion sort : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

/*

OUTPUT :

Array after applying the insertion sort : 2 3 5 6 7

TC = BEST CASE => O(n)
     AVERAGE CASE => O(n^2)
     WORST CASE => O(n^2)

SC => O(1)

 */

class Bubble_sort{
    public static void main(String[] args){
        int [] arr = {9,7,5,3,1,8,2};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean visited = false;
            for (int j = 0; j < n - i - 1 ; j++) {
                if
            }
        }
    }
}
