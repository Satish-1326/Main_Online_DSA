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

// Approach second

class Leetcode_34_Find_First_and_Last_Position_of_Element_in_Sorted_Array_app_seco{
    public static void main(String[] args){
        int [] arr = {5,7,7,8,8,10};
        int [] result =Solution34(arr , 6);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static int [] Solution34(int [] arr , int target){

        int f_occu = firstOccurance(arr , target);
        int l_occu = lastOccurance(arr , target);
        int [] result = new int[2];
        result[0] = f_occu;
        result[1] = l_occu;
        return result;
    }
    public static int firstOccurance(int [] arr , int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;

        while (low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                ans = mid;
                high = mid-1;
            }
            else if(arr[mid] < target){
                low = mid+1;
            }else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static int lastOccurance(int [] arr , int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;

        while (low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                ans = mid;
                low = mid+1;
            }
            else if(arr[mid] < target){
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
}
