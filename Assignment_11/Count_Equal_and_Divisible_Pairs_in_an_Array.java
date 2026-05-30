class Count_Equal_and_Divisible_Pairs_in_an_Array{
	public static void main(String[]args){

	int [] arr = {1,2,3,4};
	int k = 2;

	int count = 0;

	for(int i = 0 ; i < arr.length ; i++){
		for(int j = i + 1 ; j < arr.length ; j++){
			if(arr[i] == arr[j] && (i * j ) % 2 == 0){
				count++;
				}
			}
		}
	System.out.print(count);
	}
}

