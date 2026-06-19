class Count_comp{
	public static void main(String[]args){

	int [] arr = {3,4,5,7,8};
	int count = countComp(arr , 7);
	System.out.print(count);
	}
	
	public static int countComp(int [] arr , int target){
	
	int low = 0;
	int high = arr.length-1;
	int count = 0;

	while(low <= high){
		int mid = low+(high-low)/2;
		if(arr[mid] == target){
			count++;
			return count;
			}
		else if(arr[mid] < target){
			low = mid+1;
			count++;
			}
		else{
			high = mid-1;
			count++;
			}
		}
	return count;
	}
}