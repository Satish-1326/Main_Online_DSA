class Rotate_it_90_degrees_clockwise{
	public static void main(String[]args){

	int [][] arr = {
		{1,2,3},
		{4,5,6},
		{7,8,9}
		};

	int m = arr.length;
	int n = arr[0].length;

	for(int i = 0 ; i < m ; i++){
		for(int j = 0 ; j < i ; j++){
			int temp = arr[i][j];
			arr[i][j] = arr[j][i];
			arr[j][i] = temp;
			}
		}

	for(int i = 0 ; i < m ; i++){
		int start = 0;
		int end = arr[0].length - 1;
		while(start < end){
			int temp = arr[i][start];
			arr[i][start] = arr[i][end];
			arr[i][end] = temp;
			start++;
			end--;
		}
	}
	for(int i = 0 ; i < m ; i++){
		for(int j = 0 ; j < n ; j++){
			System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}
	}
}

/*

OUTPUT :

7 4 1
8 5 2
9 6 3

*/