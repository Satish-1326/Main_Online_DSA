class Demo{
	public static void main(String[]args){

	int m = 3 ;
	int n = 5 ;

	for(int i = 1 ; i <= n ; i++){
		for(int j = 1 ; j <= m ; j++){
			if(j == 1 || (i+j) == n - 1 || (i+j) % 2 == 0 && i > j){
				System.out.print("*"+" ");
				}
			else{
				System.out.print(" "+" ");
				}
			}
		System.out.println();
		}
	}
}

/*

OUTPUT :

*   *
* *
*
* *
*   *

TIME COMPLEXITY : O(n*m)
SPACE COMPLEXITY : O(1)

*/