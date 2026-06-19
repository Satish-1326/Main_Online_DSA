class First_and_Last_Occurance{
	public static void main(String[]args){

	int [] arr = {1,2,4,4,4,4,4,5,6};
	int [] result = firstAndlastOccurance(arr,4);
	for(int i = 0; i < result.length; i++){
		System.out.print(result[i]+" ");
		}
	}

	public static int [] firstAndlastOccurance(int [] arr , int target){

	int first = firstOccurance(arr,target);
	int last = lastOccurance(arr,target);
	int [] ans = new int[2];
	ans[0] = first;
	ans[1] = last;
	
	return ans;
	}
	
	public static int firstOccurance(int [] arr , int target){
	
	int low = 0;
	int high = arr.length-1;
	int ans = -1;
	
	while(low <= high){
		int mid = low+(high-low)/2;
		if(arr[mid] == target){
			ans = mid;
			high = mid-1;
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

	public static int lastOccurance(int [] arr , int target){
		
	int low = 0;
	int high = arr.length-1;
	int ans = -1;

	while(low <= high){
		int mid = low+(high-low)/2;
		if(arr[mid] == target){
			ans = mid;
			low = mid + 1;
			}
		else if(arr[mid] < target){
			low = mid + 1;
			}
		else{
			high = mid-1;
			}
		}
	return ans;
	}
}











