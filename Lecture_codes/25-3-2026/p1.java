class Demo{
	public static void main(String[]args){

	int [] arr = {1,2,3,4};
	int sum = 0;
	int result = fun (arr,0,sum);
	System.out.print("sum of array : "+result);
	}

	static int fun(int [] arr , int index , int sum){
		if(index == arr.length - 1){
			sum += arr[index];
			return sum;	
		}
	sum+= arr[index];
	return fun(arr,index+1,sum);
	}
}