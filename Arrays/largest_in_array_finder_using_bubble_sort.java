class largest_element_finder_using_bubble{
	public static void main(String[]args){

	int [] arr = {5,7,9,1,2,4,13};
	int n = arr.length;

	for(int i = 0 ; i < n - 1 ; i++){
		boolean visited = false;
		for(int j = 0 ; j < n - i - 1 ; j++){
			if(arr[j] > arr[i]){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				visited = true;
				}
			}
	if(!visited){
			break;
			}
		}

	System.out.print("Maximum element from array : ");
	for(int i = 0 ; i < n ; i++){
		if(i == arr.length-1){
			System.out.print(arr[i]);
			}
		}
	}
}

/*

OUTPUT :

Maximum element from array : 13

*/