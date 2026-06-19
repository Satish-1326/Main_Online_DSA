class BS_Character{
	public static void main(String[]args){

	char [] arr = {'a','b','c','d','e'};
	int result = bsCharacter(arr,'d');
	System.out.print(result);
	}

	public static int bsCharacter(char [] arr , char target){
	
	int low = 0;
	int high = arr.length-1;

	while(low <= high){
		int mid = low+(high-low)/2;
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

	return -1;
	}
}