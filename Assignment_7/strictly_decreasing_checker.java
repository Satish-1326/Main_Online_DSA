class Demo{
	public static void main(String[]args){

	int [] arr = {9,7,5,2};
	boolean result = fun(arr,0);
	System.out.print("strictly decreasing : "+result);
	}

	static boolean fun(int [] arr, int index){
		if(index == arr.length-1){
			return true;
		}

		if(arr[index] <= arr[index+1]){
			return false;
		}
	return fun(arr,index+1);
	}
}

/*

OUTPUT :

strictly decreasing : true	

*/