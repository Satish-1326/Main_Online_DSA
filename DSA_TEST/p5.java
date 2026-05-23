class Left_Rotate_an_Array {
	public static void main(String[]args){

	int [] arr = {1,2,3,4,5};

	reverse(arr , 0);

	for(int i = 0 ; i < arr.length ; i++){
		System.out.print(arr[i]+" ");
		}
	}

	public static void reverse(int [] arr , int pos){
		rotate(arr, 0 , pos);
		rotate(arr, pos+1 , arr.length-1);
		rotate(arr , 0 , arr.length - 1);
	}

	public static void rotate(int [] arr , int start , int end){
		while(start < end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}