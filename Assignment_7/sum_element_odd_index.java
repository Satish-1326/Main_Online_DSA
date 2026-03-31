class Demo{
	public static void main(String[]args){
	
	int [] arr = {10,20,30,40,50};
	int result = fun(arr,0);
	System.out.print("Sum of Elements at Odd Index : "+result);
	}

	static int fun(int [] arr , int index){
		if(index == arr.length){
			return 0;
		}
		
		int sum = 0;
		if(index % 2 != 0){
			sum = sum + arr[index];
			// System.out.println(arr[index]);
		}
		sum = sum + fun(arr,index+1);
		return sum;
	}
}

/*

OUTPUT :

Sum of Elements at Odd Index : 60

*/