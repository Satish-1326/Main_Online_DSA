class Demo{
	public static void main(String[]args){

	int n = 20;
	for(int i = 2 ; i <= n ; i++){
		int count = 0 ;

		for(int j = 1 ; j <= i ; j++){
			if(i % j == 0){
				count++;
				}
			}
		if(count == 2){
			System.out.print(i+" ");
			}
		}
		
	}
}

/*

OUTPUT :

2 3 5 7 11 13 17 19

*/