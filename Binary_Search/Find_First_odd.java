public class Find_First_odd {
    public static void main(String[] args){
        int [] arr = {2,4,6,8,10,11,13};
        System.out.println(findFirstOdd(arr));
    }
    public static int findFirstOdd(int [] arr){
        boolean [] arr1 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                arr1[i] = true;
            }else arr1[i] = false;
        }
        int low = 0;
        int high = arr1.length-1;
        int ans = -1;
        while (low <= high){
            int mid = low+(high-low)/2;
            if(arr1[mid]){
                ans = mid;
                high = mid - 1;
            }else low = mid+1;
        }
        return ans;
    }
}
