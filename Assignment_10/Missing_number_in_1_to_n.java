public class Missing_number_in_1_to_n {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int o_sum = (n * (n + 1) / 2);
        int result = o_sum - sum;

        System.out.println("Missing Number : " + result);
    }
}

/*

OUTPUT :

Missing Number : 2

 */
