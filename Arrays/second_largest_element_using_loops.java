public class second_largest_element_using_loops {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 1, 3, 4, 13};
        int f_small = 0;
        int s_small = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > f_small) {
                f_small = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > s_small && arr[i] != f_small) {
                s_small = arr[i];
            }
        }
        System.out.println("Second largest Elements from array : " + s_small);
    }
}

/*

OUTPUT :

__Second Smallest Elements from array : 9

 */
