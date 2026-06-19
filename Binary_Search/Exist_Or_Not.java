public class Exist_Or_Not {
    public static void main(String[] args){
        int [] arr = {3,4,7,9,15};
        boolean result = existOrNot(arr , 9);
	System.out.print(result);
    }
    public static boolean existOrNot(int [] arr , int target){
        boolean isPresent = false;
        int low = 0;
        int high = arr.length-1;

        while (low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target) {
                return true;
            } else if(arr[mid] < target){
                low = mid +1;
            }else{
		high = mid-1;
	    }
        }
	return false;
    }
}
