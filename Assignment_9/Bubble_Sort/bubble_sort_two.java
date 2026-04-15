class Demo{
	public static void main(String[]args){

	int [] arr = {15, 10, 25, 40, 30};
	int n = arr.length;

	for(int i = 0 ; i < n - 1 ; i++){
		boolean swapped = false;
		for(int j = 0 ; j < n - i - 1 ; j++){
			if(arr[j] > arr[j+1]){
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				swapped = true;
				}
			}
		if(!swapped){
			break;
			}
		}

	System.out.print("Sorted array using bubble sort : ");
	for(int i = 0 ; i < n ; i++){
		System.out.print(arr[i] + " ");
		}
	}
}

/*

OUTPUT : 

Sorted array using bubble sort : 10 15 25 30 40

*/