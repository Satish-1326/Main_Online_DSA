class Demo{
	public static void main(String[]args){
		
	int [] arr = {3,9,1,7};
	int result = fun(arr,0);
	System.out.print(result);
	}

	static int fun(int [] arr , int index){
		if(index == 1){
			return arr[0];
		}

	int s_max = fun(arr,index+1);
	
	return Math.max(arr[index+1] , s_max);
	}
}