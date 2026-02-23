class Demo{
	public static void main(String[]args){

	int n = 4 ;
	int size = (2*n) - 1 ;

		for(int i = 1 ; i <= size ; i++){
			for(int j = 1 ; j <= size ; j++){
	
			int m = n - Math.min(Math.min(i - 1 ,j - 1) , Math.min(size - i , size - j));

			System.out.print(m+" ");
			}
			System.out.println();
		}
	}
}

/*

OUTPUT :

4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4

*/