class Demo{
	public static void main(String[]args){
		
		int n = 3 ;
		int size = (n*2) - 1;

		for(int i = 1 ; i <= size ; i++){
			for(int j = 1 ; j <= size ; j++){
				int value = n - Math.min(Math.min(i-1,j-1),Math.min(size-i , size-j));

				System.out.print(value+" ");
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