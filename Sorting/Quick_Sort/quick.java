class Demo {
    public static void main(String[] args) {
        int[] arr = {13, 7, 6, 5, 41, 38, 21, 9, 21, 7};
        int low = 0;
        int high = arr.length - 1;

        f(arr, low, high);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void f(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivot = pivotFinder(arr, low, high);

        f(arr, low, pivot - 1);
        f(arr, pivot + 1, high);
    }

    public static int pivotFinder(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            while (j >= low && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}