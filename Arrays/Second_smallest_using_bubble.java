public class Second_smallest_using_bubble {
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 4, 3, 1, 19, 1};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean visited = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    visited = true;
                }
            }
            if (!visited) {
                break;
            }
        }
        System.out.print("Sorted array using bubble sort : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int f_small = arr[0];
        int s_small = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < s_small && arr[i] != f_small) {
                s_small = arr[i];
            }
        }


        System.out.println("First smallest element in array : " + f_small);
        System.out.println("Second smallest element in array : " + s_small);
    }
}

/*

OUTPUT :

Sorted array using bubble sort : 1 1 3 3 4 5 7 19
First smallest element in array : 1
Second smallest element in array : 3

 */
