public class second_largest_element_using_selection_sort {
    public static void main(String[] args){
        int [] arr = {5,7,9,1,3,4,13};
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i+1; j < n ; j++) {
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        System.out.print("Sorted array using selection sort : ");
        for (int i = 0; i < n; i++) {
            if(i == arr.length-2){
                System.out.println(arr[i]);
            }
        }
    }
}

/*

OUTPUT :

Sorted array using selection sort : 9

 */
