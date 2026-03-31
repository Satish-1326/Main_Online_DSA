class Demo{
	public static void main(String[]args){
	
	int [] arr = {5,2,8,1,3};
	int result = fun(arr,0);
	System.out.print("index of minimum element : "+result);
	}

	static int fun(int [] arr , int index){
		if(index == arr.length-1){
		return index;
		}

		int min = fun(arr,index+1);
		
		if(arr[index] < arr[min]){
			return index;
		}
	return min;
	}
}

/*

OUTPUT :

index of minimum element : 3

*/