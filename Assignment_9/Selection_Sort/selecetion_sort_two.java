class Demo{
	public static void main(String[]args){

	int [] arr = {34, 12, 56, 45, 23};
	int n = arr.length;

	for(int i = 0 ; i < n - 1 ; i++){
		int min_index = i ;
		for(int j = i + 1 ; j < n ; j++){
			if(arr[j] < arr[min_index]){
				min_index = j;
				}
			}
		int temp = arr[i];
		arr[i] = arr[min_index];
		arr[min_index] = temp;
		}

	System.out.print("Sorted array using selection sort : ");
	for(int i = 0 ; i < n ; i++){
		System.out.print(arr[i] +" ");
		}
	}
}

/*

OUTPUT :

Sorted array using selection sort : 12 23 34 45 56

*/