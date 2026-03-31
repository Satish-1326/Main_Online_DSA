class Demo{
	public static void main(String[]args){

	int [] arr = {1,2,3,4};
	boolean result = fun(arr,0);
	System.out.print("no duplicates exist : "+result);
	}

	static boolean fun(int [] arr , int index){
		if(index == arr.length){
			return true;
		}

	for(int i = index+1 ; i < arr.length; i++){
		if(arr[i] == arr[index]){
			return false;
		}
	}

	return fun(arr,index+1);
	}	
}

/*

OUTPUT :

no duplicates exist : true

*/