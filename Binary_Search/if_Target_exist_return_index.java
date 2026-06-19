class If_Target_exist_return_index{
	public static void main(String[]args){

	int [] arr = {4,10,22,24,35,40};
	int result = Solution1(arr,24);
	System.out.print(result);
	}

	public static int Solution1(int [] arr , int target){
		int low = 0;
		int high = arr.length-1;

		while(low <= high){
			int mid = low+(high - low)/2;
			if(arr[mid] == target){
				return mid;
			}
			else if(arr[mid] < target){
				low = mid+1;
			}
			else{
				high = mid-1;
			}
		}
		return 0;
	}
}