public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args){
        int [] arr = {5,7,7,8,8,10};
        int target = 6;

        int [] result = new int[2];
        int k = 0;

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                result[k] = i;
                k++;
                found = true;
            }
        }
        if(!found){
            result[0] = -1;
            result[1] = -1;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
