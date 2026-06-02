class Count_Inversions_in_an_Array{
	public static void main(String[]args){

	int [] arr = {5,3,2,1,4};
	int count = 0 ;

	for(int i = 0 ; i < arr.length ; i++){
		for(int j = i + 1 ; j < arr.length ; j++){
			if(arr[i] > arr[j]){
				count++;
				}
			}
		}
	System.out.print(count);
	}
}