class Demo{
	public static void main(String[]args){

	int [] arr = {1,2,3,4};
	int target = 3;
	boolean result = fun(arr,0,target);
	System.out.print("target exists : "+result);
	}

	static boolean fun(int [] arr , int index , int target){
		if(index == arr.length-1){
			if(arr[index] == target){
				return true;
			}
		return false;
		}

	if(arr[index] == target){
		return true;
		}

	return fun(arr,index+1,target);
	}
}

/*

OUTPUT :

target exists : true

*/