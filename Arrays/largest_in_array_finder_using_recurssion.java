class Largest_element_finder_three{
	public static void main(String[]args){

	int [] arr = {5,7,9,1,2,4,13};
	int result = Solution(arr,0);

	System.out.print("Greatest Element from a array : "+result);
	}

	public static int Solution(int [] arr , int index){
		if(index == arr.length-1){
			return arr[index];
		}

	int result = Solution(arr,index+1);
	return Math.max(arr[index] , result);
	}
}

/*

OUTPUT :

Greatest Element from a array : 13

*/