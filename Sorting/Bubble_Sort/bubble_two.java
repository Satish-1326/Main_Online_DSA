class Demo{
	public static void main(String[]args){
		
	int [] arr = {12,4,7,9,1};
	int n = arr.length ;

	for(int i = 0 ; i < n - 1 ; i++){
		boolean visited = false;
		for(int j = 0 ; j < n - i - 1 ; j++){
			if(arr[j] > arr[j+1]){
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
			}
		if(!visited){
			break;
			}
		}

	System.out.print("Final Sorted Array : ");
	for(int i = 0 ; i < n ; i++){
		System.out.print(arr[i]+" ");
		}
	}
}

/*

OUTPUT :

Final Sorted Array : 4 7 9 1 12

TC = BEST CASE => O(n)
     AVERAGE CASE => O(n^2)
     WORST CASE => O(n^2)

SC = O(1)

*/