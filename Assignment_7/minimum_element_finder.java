class Demo{
	public static void main(String[]args){

	int [] arr = {3,9,1,7};
	int result = fun(arr,0);
	System.out.print("Minimum value from array : "+result);
	}

	static int fun(int [] arr , int index){
		if(index == arr.length-1){
			return arr[0];
		}

	int s_max = fun(arr,index + 1);
	return Math.min(arr[index+1] , s_max);
	}
}

/*

OUTPUT :

Minimum value from array : 1

*/