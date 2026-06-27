public class Leetcode_162_Find_Peak_Element {
    public static void main(String[] args){
        int [] arr = {1,2,3,1};
        System.out.println(findPeakElement(arr));
    }
    public static int findPeakElement(int [] arr){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while (low < high){
            int mid = low+(high-low)/2;
            if(arr[mid] > arr[mid+1]){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}
