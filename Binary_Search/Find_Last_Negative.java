public class Find_Last_Negative {
    public static void main(String[] args){
        int [] arr = {-10,-8,-5,-2,3,7};
        System.out.println(findLastNeg(arr));
    }
    public static int findLastNeg(int [] arr){
        boolean [] arr1 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                arr1[i] = true;
            }else arr1[i] = false;
        }
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while (low <= high){
            int mid = low+(high-low);
            if(arr1[mid]){
                ans = mid;
                low = mid+1;
            }else high = mid-1;
        }
        return arr[ans];
    }
}
