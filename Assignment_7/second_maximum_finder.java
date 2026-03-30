class Demo{
	public static void main(String[]args){

	int [] arr = {10,5,8,20,15};
	int max_one = fun_one(arr,0);

	//System.out.print(max_one);
	int max_two = fun_two(arr,0,max_one);
	System.out.print("second largest element : "+max_two);
	}

	static int fun_one(int [] arr , int index){
		if(index == arr.length - 1){
			return arr[index];
		}
		int maximum = fun_one(arr,index+1);
		return Math.max(arr[index] , maximum);
	}

	static int fun_two(int [] arr , int index , int max_one){
		if(index == arr.length-1){
			return arr[index];
		}
		int s_maximum = fun_two(arr , index+1 , max_one);
		int result = Math.max(arr[index] , s_maximum);

		if(arr[index] != max_one){
			return result;
		}
		return s_maximum;
	}
}

/*

OUTPUT :

second largest element : 15

*/