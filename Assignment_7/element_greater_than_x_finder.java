class Demo{
	public static void main(String[]args){

	int [] arr = {1,5,3,7,2};
	int target = 3;
	int result = fun(arr,0,target);
	System.out.print("count of elements greater than given value : "+result);
	}

	static int fun(int [] arr , int index , int target){
		if(index == arr.length-1){
			if(arr[index] > target){
				return 1;
			}
			return 0;
		}

	int count = 0;
	if(arr[index] > target){
		count ++;
		}
	return count + fun(arr,index+1,target);
	
	}
}

/*

OUTPUT :

count of elements greater than given value : 2

*/