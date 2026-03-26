class Demo{
	public static void main(String[]args){

	int [] arr = {2,5,3,5,7,5};
	int target = 5;
	int result = fun(arr,0,target);
	System.out.print(result);
	}

	static int fun(int [] arr , int i, int target){
		if(i == arr.length){
			return -1;
		}

	int result = fun(arr,i+1,target);

	if(result != -1){
		return result;
		}

	if(arr[i] == target){
		return i;
		}
	return -1;
	}
}