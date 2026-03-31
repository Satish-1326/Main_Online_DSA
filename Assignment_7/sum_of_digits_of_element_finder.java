class Demo{
	public static void main(String[]args){
	
	int [] arr = {12, 34, 5};
	int result = fun(arr,0);
	System.out.print("sum all digits recursively : "+result);
	}

	static int fun(int [] arr , int index){
		if(index == arr.length){
			return 0;
		}

	int sum = 0;
	int temp = arr[index];
	while(temp != 0){
		sum += temp % 10;
		temp = temp / 10;
		}

	return sum + fun(arr,index+1);
	}
}

/*

OUTPUT :

sum all digits recursively : 15

*/