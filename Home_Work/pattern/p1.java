class Demo{
	public static void main(String[]args){
		
	int a = 3 ;
	int size = (2*a) - 1 ;

		for(int i = 1 ; i <= size ; i++){
			for(int j = 1 ; j<= size ; j++){
				
			int top = i - 1 ;
			int left = j - 1 ;
			int bottom = size - i ;
			int right = size - j ;

			int smallest1 = Math.min(top,bottom) ;
			int smallest2 = Math.min(left,right) ;

			int final_smallest = Math.min(smallest1,smallest1) ;

			int final_result = a - final_smallest;

			System.out.print(final_result+" ");
			}
			System.out.println();
		}
	}
}