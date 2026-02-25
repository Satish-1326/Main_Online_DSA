class Demo{
	public static void main(String[]args){

	int n = 4 ;

	int num = 1 ;

	for(int i = 1 ; i <= n ; i++){
		for(int j = 1 ; j <= n - i ; j++){
			System.out.print(" ");
			}
		for(int j = 1 ; j <= i ; j++){
			System.out.print(num+" ");
			num++;
			}
	System.out.println();
		}

		int m = 3 ;
		for(int i = m ; i >= 1; i--){
			for(int j = 1 ; j <= m- i ; j++){
				System.out.print(" ");
			}
			for(int j = 1 ; j <= i ; j++){
				System.out.print(num+" ");
				num++;
			}
		System.out.println();
		}
	}
}

/*

OUTPUT :

   1
  2 3
 4 5 6
7 8 9 10
11 12 13
 14 15
  16

*/