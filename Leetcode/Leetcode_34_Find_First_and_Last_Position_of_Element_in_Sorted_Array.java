import java.util.HashMap;

public class Leetcode_34_Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args){
        int [] arr = {5,7,7,8,8,10};
        int target = 8;
        int [] result = {-1,-1};

        boolean found = false;

//        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == target){
                if(result[0] == -1){
                    result[0] = i;
                }
                result[1] = i;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
