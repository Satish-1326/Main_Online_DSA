public class Check_if_the_array_is_sorted {
    public static void main(String[] args){
        int [] arr = {1, 2, 3, 5};
        boolean result = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1]){
                result = false;
                break;
            }
            else{
                result = true;
            }
        }
        System.out.println("Array is sorted : "+result);
    }
}

/*

OUTPUT :

Array is sorted : true

 */
