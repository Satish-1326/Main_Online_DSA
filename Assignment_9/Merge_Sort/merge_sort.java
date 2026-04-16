// merge sort for input 1

class Demo {
    public static void main(String[] args) {
        int[] arr = {50, 23, 9, 18, 61, 32};
        int low = 0;
        int high = arr.length - 1;
        f(arr, low, high);

        System.out.print("Sorted array using merge sort : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void f(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = (high + low) / 2;
        f(arr, low, mid);
        f(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] merged = new int[high - low + 1];
        int blue = low;
        int green = mid + 1;
        int red = 0;

        while (blue <= mid && green <= high) {
            if (arr[blue] <= arr[green]) {
                merged[red] = arr[blue];
                red++;
                blue++;
            } else {
                merged[red] = arr[green];
                red++;
                green++;
            }
        }
        while (blue <= mid) {
            merged[red] = arr[blue];
            red++;
            blue++;
        }
        while (green <= high) {
            merged[red] = arr[green];
            red++;
            green++;
        }

        for (int i = 0; i < merged.length; i++) {
            arr[low + i] = merged[i];
        }
    }
}

/*

OUTPUT :

Sorted array using merge sort : 9 18 23 32 50 61

 */