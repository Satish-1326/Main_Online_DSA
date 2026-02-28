// Approach 1 to print the spiral pattern 

class Demo{
	public static void main(String[]args){
		
	int n = 3 ;
	int size = (2 * n - 1) ;

		for(int i = 1 ; i <= size ; i++){
			for(int j = 1 ; j<= size ; j++){
				
			int top = i - 1 ;
			int left = j - 1 ;
			int bottom = size - i ;
			int right = size - j ;

			int smallest1 = Math.min(top,left) ;
			int smallest2 = Math.min(bottom , right) ;

			int final_smallest = Math.min(smallest1,smallest2) ;

			int final_result = n - final_smallest;

			System.out.print(final_result+" ");
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