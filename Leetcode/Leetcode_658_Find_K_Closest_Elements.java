import java.util.ArrayList;
import java.util.List;

public class Leetcode_658_Find_K_Closest_Elements {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        System.out.println(findClosestElements(arr,4,3));
    }
    public static List<Integer> findClosestElements(int [] arr , int k , int x){

        int left = 0;
        int right = arr.length-1;

        while (right-left+1 > k){
            if(x - arr[left] > arr[right] - x){
                left++;
            }else{
                right--;
            }
        }
        List<Integer> al = new ArrayList<>();
        for (int i = left; i <= right ; i++) {
            al.add(arr[i]);
        }
        return al;
    }
}
