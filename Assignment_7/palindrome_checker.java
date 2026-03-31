class Demo{
	public static void main(String[]args){

	int [] arr = {1,2,3,2,1};
	boolean result = fun(arr,0,arr.length-1);
	System.out.print("array is palindrome : "+result);
	}

	static boolean fun(int [] arr , int start , int end){
		if(start >= end){
			return true;
		}

		if(arr[start] != arr[end]){
			return false;
		}

	return fun(arr,start+1,end-1);
	}
}

/*

OUTPUT :

array is palindrome : true

*/