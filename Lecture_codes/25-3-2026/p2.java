class Demo{
	public static void main(String[]args){

	int [] arr = {1,4,6,2,3};
	int max = Integer.MIN_VALUE;
	int result = fun(arr, 0 ,max);
	System.out.print(result);
	}
	
	static int fun(int [] arr , int index , int max){
		if(index == arr.length-1){
			if(arr[index] > max){
				max = arr[index];
			}
		return max;
		}

		if(arr[index] > max){
			max = arr[index];
		}
	return fun(arr , index+1 , max);
	}
}