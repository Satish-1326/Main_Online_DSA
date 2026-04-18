public class Array_is_sorted_app_1 {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 10};
        boolean result = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        System.out.print("Array is sorted : " + result);
    }
}

/*

OUTPUT :

Array is sorted : true

 */
