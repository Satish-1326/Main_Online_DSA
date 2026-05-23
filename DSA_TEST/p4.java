class Implement_Bubble_Sort {
	public static void main(String[]args){

	int [] arr = {64,34,25,12,22,11};
	int n = arr.length;

	for(int i = 0 ; i < n - 1 ; i++){
		boolean sapadal = false;
		for(int j = 0 ; j < n - i - 1 ; j++){
			if(arr[j] > arr[j+1]){
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				sapadal = true;
				}
			}
		if(!sapadal){
			break;
			}
		}
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
	}
}

/*

OUTPUT :

11 12 22 25 34 64

*/