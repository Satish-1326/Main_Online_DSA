public class Leetcode_55_Jump_Game {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 0, 4};

        boolean result = Solution55(arr);
        System.out.println(result);
    }

    public static boolean Solution55(int[] arr) {
        int pos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i > pos) {
                return false;
            }
            pos = Math.max(pos, i + arr[i]);
        }
        return true;
    }
}
