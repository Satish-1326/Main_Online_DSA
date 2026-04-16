public class insertion_sort_two {
    public static void main(String[] args){
        int [] arr = {34,12,56,45,23};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int left = i - 1;
            int current_element = arr[i];

            while (left >= 0 && arr[left] >= current_element){
                arr[left + 1] = arr[left];
                left--;
            }

            arr[left + 1] = current_element;
        }

        System.out.print("Sorted array using insertion sort : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

/*

OUTPUT :

Sorted array using insertion sort : 12 23 34 45 56

 */
