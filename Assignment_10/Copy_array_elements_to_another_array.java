public class Copy_array_elements_to_another_array {
    public static void main(String[] args){
        int [] arr = {1, 5, 9, 13};
        int n = arr.length;

        int [] arr2 = new int[n];
        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            arr[i] = arr[j];
            i++;
        }

        System.out.print("Elemenets from array 2 : ");
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr[j]+" ");
        }
    }
}

/*

OUTPUT :

Elemenets from array 2 : 1 5 9 13

 */
