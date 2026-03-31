class Demo{
	public static void main(String[]args){

	int [] arr = {2,4,6};
	boolean result = fun(arr,0);
	System.out.print("All elements are Even : "+result);
	}

	public static boolean fun(int [] arr , int index){
		
		if(index == arr.length){
			
				return true;
		}

	if(arr[index] % 2 != 0){
		return false;
		}
	return fun(arr , index+1);
	}
}

/*

OUTPUT :

All elements are Even : true

*/