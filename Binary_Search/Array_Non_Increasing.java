class Array_Non_Increasing{
	public static void main(String[]args){

	int [] arr = {80,70,60,50,40,30};
	int result = arrayNonIncreasing(arr,40);
	System.out.print(result);
	}

	public static int arrayNonIncreasing(int [] arr , int target){

	int low = 0;
	int high = arr.length-1;

	while(low <= high){
		int mid = low+(high-low)/2;
		if(arr[mid] == target){
			return mid;
			}
		else if(arr[mid] < target){
			high = mid-1;
			}
		else {
			low = mid+1;
			}
		}
	return -1;
	}
}