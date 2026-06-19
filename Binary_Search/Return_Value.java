class Return_Value{
	public static void main(String[]args){

	int [] arr = {4,6,7,9,12};
	int result = returnValue(arr , 7);
	System.out.print(result);
	}
	public static int returnValue(int [] arr , int target){

	int low = 0;
	int high = arr.length-1;

	while(low <= high){
		int mid = low+(high-low)/2;
		if(arr[mid] == target){
			return arr[mid];
			}
		else if(arr[mid] < target){
			low = mid+1;
			}
		else{
			high = mid-1;
			}
		}
	return -1;
	}
}