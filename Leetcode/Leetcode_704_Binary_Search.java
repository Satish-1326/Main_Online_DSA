public class Leetcode_704_Binary_Search {
    public static void main(String[] args){
        int [] arr = {-1,0,3,5,9,12};
       int result = Solution704(arr,0,arr.length,9);
        System.out.println(result);
    }
    public static int Solution704(int [] arr , int low , int high , int target){
        if(low > high){
            return -1;
        }
        int mid = low+(high-low)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] < target){
            return Solution704(arr , mid+1 , high , target);
        }
        return Solution704(arr , low , mid-1,target);
    }
}
