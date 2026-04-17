class Demo {
    public static void main(String[] args) {
        int[] arr = {42, 56, 12, 67, 34};
        int low = 0;
        int high = arr.length - 1;

        f(arr, low, high);

        System.out.print("Sorted array using quick sort : ");
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

/*

OUTPUT :

Sorted array using quick sort : 12 34 42 56 67

 */