class Demo{
	public static void main(String[]args){

	int [] arr = {1,2,4,6,4};
	int result = fun(arr,0,6);
	System.out.print(result);
	}

	static int fun(int [] arr , int i, int target){
		if(i == arr.length-1){
			return -1;
		}
		
		if(arr[i] == target){
			return i;
		}
	return fun(arr , i+1 , target);
	
	}
}