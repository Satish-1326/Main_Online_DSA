public class Find_ceiling {
    public static void main(String[] args){
        int [] arr = {1,2,4,4,4,4,7,9};
        int target = 5;

        boolean [] arr1 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > target){
                arr1[i] = true;
            }
        }
        int low = 0;
        int high = arr.length-1;
        int ans = -1;

        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr1[mid]){
                ans = arr[mid];
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println(ans);
    }
}
