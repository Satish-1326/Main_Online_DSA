class Demo {
    static int lastIndex = -1;

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 5, 7, 5, 9};
        int target = 5;

        findLast(arr, 0, target);
        System.out.println("Last Occurrence: " + lastIndex);
    }

    static void findLast(int[] arr, int i, int target) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == target) {
            lastIndex = i;  
        }

        findLast(arr, i + 1, target);
    }
}