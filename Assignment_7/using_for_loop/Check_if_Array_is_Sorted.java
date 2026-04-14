public class Check_if_Array_is_Sorted {
    public static void main(String[] args){
        int [] arr = {1,2,3,4};
        boolean result = false;

        for (int i = 0; i < arr.length -1 ; i++) {
            if(arr[i] < arr[i+1]){
                result = true;
            }
        }
        System.out.println("sorted in ascending order : "+result);
    }
}

/*

OUTPUT :

sorted in ascending order : true

*/
