class Demo{
	public static void main(String[]args){

	int [] arr = {1,2,2,3,2};
	int target = 2;
	int result = fun(arr,0,target);
	System.out.print("Total occurrance of number : "+result);
	}

	static int fun(int [] arr , int index , int target){
		if(index == arr.length){
			return 0;
		}

		int count = 0;

		if(arr[index] == target){
			 count++;
		}
	return count + fun(arr,index+1,target);
	}
}