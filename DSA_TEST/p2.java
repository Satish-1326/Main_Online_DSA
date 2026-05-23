class Print_a_reverse_number_triangle {
	public static void main(String[]args){
	
	int n = 5;
	for(int i = 0 ; i < n ; i++){
		for(int j = n ; j > i ; j--){
			System.out.print(j+" ");
			}
		System.out.println();
		}
	}
}

/*

OUTPUT :

5 4 3 2 1
5 4 3 2
5 4 3
5 4
5

*/