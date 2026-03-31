class Demo{
	public static void main(String[]args){

	int [] arr = {2,4,5,6,9};
	int k = 2;
	int result = fun(arr,0,k);
	System.out.print("count of elements divisible by k : "+result);
	}

	static int fun(int [] arr , int index , int k){
		if(index == arr.length){
		return 0;
		}

		int count = 0;
		if(arr[index] % 2 == 0){
			count++;
		}
	return count + fun(arr,index+1,k);
	}
}

/*

OUTPUT :

count of elements divisible by k : 3

*/