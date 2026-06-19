class BS_Recursive{
	public static void main(String[]args){

	int [] arr = {3,4,6,7,9};
	int result = bsRecursive(arr,0,arr.length-1,9);
	System.out.print(result);
	}

	public static int bsRecursive(int [] arr , int low , int high,int target){
	if(low > high){
		return -1;
		}

	int mid = low+(high-low)/2;

	if(arr[mid] == target){
		return mid;
		}
	else if(arr[mid] < target){
		return bsRecursive(arr,mid+1,high,target);
		}
	return bsRecursive(arr,low,mid-1,target);
	}
}