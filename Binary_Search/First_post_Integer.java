public class First_post_Integer {
    public static void main(String[] args){
        int [] arr = {-1,-2,-3,0,1,3};
        System.out.println(nonNegative(arr));
    }
    public static int nonNegative(int [] arr){
        boolean [] arr1 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                arr1[i] = true;
            }else arr1[i] = false;
        }
        int low = 0;
        int high = arr1.length-1;
        int ans = -1;
        while (low <= high){
            int mid = low+(high - low);
            if(arr1[mid]){
                ans = mid;
                high = mid-1;
            }else low = mid+1;
        }
        return ans;
    }
}
