class Demo{
	public static void main(String[]args){

	int [] arr = {13,44,27,57,29,7};
	int n = arr.length;

	for(int i = 0 ; i < n-1 ; i++){
		int min_index = i;
		for(int j = i+1 ; j < n ; j++){
			if(arr[j] < arr[min_index]){
				min_index = j;
				}
			}
		int temp = arr[i];
		arr[i] = arr[min_index];
		arr[min_index] = temp;
		}

	System.out.print("Array after aaplying selection sort : ");
	for(int i = 0 ; i < n ; i++){
		System.out.print(arr[i]+" ");
		}
	}
}

/*

OUTPUT :

Array after aaplying selection sort : 7 13 27 29 44 57

TC = BEST CASE => O(n^2)
     AVERAGE CASE => O(n^2)
     WORST CASE => O(n^2)

*/