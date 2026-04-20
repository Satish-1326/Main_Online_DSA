public class Moving_zero_end {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 5, 0, 8};
        int[] new_arr = new int[arr.length];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                new_arr[index] = arr[i];
                index++;
            }
        }

        System.out.print("Array after moving all zeros to the end : ");
        for (int q = 0; q < new_arr.length; q++) {
            System.out.print(new_arr[q] + " ");
        }
    }
}

/*

OUTPUT :

Array after moving all zeros to the end : 1 3 5 8 0 0

 */

class Moving_zero_end_same_array {
    public static void main(String[] args) {
        int[] arr = {0, 3, 0, 5, 0, 7};
        int size = arr.length;
        int nz = 0;
        int z = 0;

        while (nz < size) {
            if (arr[nz] != 0) {
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz++;
                z++;
            } else {
                nz++;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*

OUTPUT :

3 5 7 0 0 0

 */
