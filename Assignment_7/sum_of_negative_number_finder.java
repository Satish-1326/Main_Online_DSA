class Demo{
	public static void main(String[]args){

	int [] arr = {1,-2,3,-4,5};
	int result = fun(arr,0);
	System.out.print("sum of all negative elements : "+result);
	}

	static int fun(int [] arr , int index){
		if(index == arr.length - 1){
			return 0;
		}

		int sum =  0 ;
		if(arr[index] < 0){
			sum += arr[index];
		}

	return sum + fun(arr,index+1);
	}
}

/*

OUTPUT :

sum of all negative elements : -6

*/