// Approach 2 to print the spiral model 

class Demo{
	public static void main(String[]args){

	int n = 3 ;

	int size  = 2 * n - 1;

		for(int i = 1 ; i <= size ; i++){
			for(int j = 1 ; j <= size ; j++){
				int smallest = Math.min(Math.min(i - 1 , j - 1), Math.min(size - i , size - j));

				int result = n - smallest ;

				System.out.print(result+" ");
			}
			System.out.println();
		}
	}
}

/*

OUTPUT :

3 3 3 3 3
3 2 2 2 3
3 2 1 2 3
3 2 2 2 3
3 3 3 3 3

*/