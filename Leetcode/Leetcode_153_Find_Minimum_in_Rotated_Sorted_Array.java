public class Leetcode_153_Find_Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args){
        int [] arr = {3,4,5,1,2};
        int low = 1;
        int high = arr.length - 1;

        while (low < high){
            int mid = (low + high) /2;
            if(arr[mid] > arr[high]){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        System.out.println(arr[low]);
    }
}

// my name is satish

/*

a = b + c * d ;
t1 = c * d;
t2 = t1 + a;
t3 = t2;

 */

//int => low => = => 1


