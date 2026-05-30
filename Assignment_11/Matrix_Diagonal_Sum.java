class Matrix_Diagonal_Sum{
	public static void main(String[]args){

	int [][] arr = {
			{1,1,1,1},
			{1,1,1,1},
			{1,1,1,1},
			{1,1,1,1}
		};

	int sum = 0;

	int m = arr.length;
	int n = arr[0].length;

	for(int i = 0 ; i < m ; i++){
		for(int j = 0 ; j < n ; j++){
			if(i == j){
				sum += arr[i][j];
				}
			}
		}
	for(int i = 0 ; i < m ; i++){
		for(int j = 0 ; j < n ; j++){
			if(i + j == n - 1){
				sum += arr[i][j];
			}
		}
	}
	if(n % 2 == 1){
		sum -= arr[n / 2][n/2];
	}
	System.out.print(sum);
	}
}