class Demo{
	public static void main(String[]args){

	int n = 6 ;
	
		// spaces
		for(int i = 1 ; i <= n ; i++){
			for(int j = 1 ; j <= n - i ; j++){
				System.out.print(" ");
			}

		// stars

			for(int j = 1 ; j <= (2 * i)-1 ; j++){
				System.out.print("*");
			}
			System.out.println();
		}

	int m = 5 ;

		// spaces 

		for(int i = m ; i >= 1 ; i--){
			for(int j = 1 ; j <= n - i ; j++){
				System.out.print(" ");
			}

		//stars

			for(int j = 1 ; j <= (2*i)-1 ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*

OUTPUT :

     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *

*/