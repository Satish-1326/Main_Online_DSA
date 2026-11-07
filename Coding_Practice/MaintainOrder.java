// Arrange the array in a such way that given array => {-1,2,3,4,-6,-5}
//					output array =>{2,-1,3,-6,4,-5}

class Demo{
	public static void main(String[]args){

	int [] arr = {-1,2,3,4,-6,-5};
	int n = arr.length;


	for(int i = 0 ; i < n - 1; i++){
		if(i % 2 == 0 && arr[i] < 0){

			int j = i + 1;

			while(j < n && arr[j] < 0){
				j++;
			}
			if(j < n){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		else if(i % 2 != 0 && arr[i] > 0){

			int j = i + 1;

			while(j < n && arr[j] > 0){
				j++;
			}
			if(j < n){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}

	for(int i = 0 ; i < n ; i++){
		System.out.print(arr[i]+" ");
		}
	}
}


/*

OUTPUT : 

2 -1 3 -6 4 -5

*/