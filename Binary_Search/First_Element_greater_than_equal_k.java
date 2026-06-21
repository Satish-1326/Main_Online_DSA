public class First_Element_greater_than_equal_k {
    public static void main(String[] args){
        int [] arr = {1,2,4,4,4,7,9};
        System.out.println(lowerBound(arr,4));
    }
    public static int lowerBound(int [] arr , int k){
        boolean [] arr1 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= k){
                arr1[i] = true;
            }else{
                arr1[i] = false;
            }
        }

        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while (low <= high){
            int mid = low+(high-low)/2;
            if(arr1[mid]){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}
