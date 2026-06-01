class Rearrange_array{
	public static void main(String[]args){

	int [] arr = {1,2,-3,-1,-2,3};
	int n = arr.length;

	int [] result = new int[n];
	int pos = 0;
	int neg = 1;

	for(int i = 0 ; i < arr.length ; i++){
		if(arr[i] > 0){
			result[pos] = arr[i];
			pos += 2;
			}
		else{
			result[neg] = arr[i];
			neg += 2;
			}
		}
	for(int i = 0 ; i < arr.length ; i++){
		System.out.print(result[i]+" ");
		}
	}
}