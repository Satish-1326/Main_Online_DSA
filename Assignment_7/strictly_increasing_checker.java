class Demo{
	public static void main(String[]args){

	int [] arr = {1,2,3,3};
	boolean result = fun(arr,0);
	System.out.print("Array is strictly increasing : "+result);
	}
	
	static boolean fun(int [] arr , int index){
		if(index == arr.length-1){
			return true;
		}
	
	if(arr[index] >= arr[index+1]){
		return false;
		}
	return fun(arr,index+1);
	}
}

/*

OUTPUT :

Array is strictly increasing : false

*/