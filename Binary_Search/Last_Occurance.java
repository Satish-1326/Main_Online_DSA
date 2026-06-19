class Last_Occurance{
	public static void main(String [] args){

	int [] arr = {1,2,4,4,4,4,5,6};
	int result = lastOccurance(arr,4);
	System.out.print(result);
	}

	public static int lastOccurance(int [] arr , int target){
		int low = 0;
		int high = arr.length-1;
		int ans = -1;

		while(low <= high){
			int mid = low+(high-low)/2;
			if(arr[mid] == target){
				ans = mid;
				low = mid+1;
			}
			else if(arr[mid] < target){
				low = mid+1;
			}
			else{
				high = mid-1;
			} 
		}
	return ans;
	}
}