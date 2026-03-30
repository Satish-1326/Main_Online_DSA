class Demo{
	public static void main(String[]args){

	int [] arr = {1,2,3,4};
	boolean result = fun(arr,0);
	System.out.print(result);
	}

	static boolean fun(int [] arr , int index){
		if(index == arr.length - 1){
			return false;
		}
		
		fun(arr,index+1);
		if(arr[index]+1 == arr[index+1]){
			return true;
		}

	return false;
	}
}