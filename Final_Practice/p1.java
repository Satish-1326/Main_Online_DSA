class Codex{
	public static void main(String [] args){

	int [] arr = {1,1,2,3,4,6,7,9};
	int max = 0;

	for(int i = 0 ; i < arr.length; i++){
		if(arr[i] > max){
			max = arr[i];
			}
		}
	int [] result = new int[max+1];

	for(int i = 0 ; i < arr.length; i++){
		result[arr[i]]++;
		}

	for(int i = 0 ; i < result.length; i++){
		System.out.println(i+" " + result[i]);
		}
	}	
}