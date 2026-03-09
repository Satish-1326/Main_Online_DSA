class Demo{
	public static void main(String[]args){

	int n = 4 ;

	for(int i = 1 ; i <= n ; i++){
		for(int j = 1 ; j <= 5 ; j++){
			if(i >= 2 && i <= 3 && j >= 2 && j <= 4){
				System.out.print("  ");
				}else{
					System.out.print("*"+" ");
				}
			}
		System.out.println();
		}
	}
}

/*

OUTPUT :
* * * * *
*       *
*       *
* * * * *

TIME COMPLEXITY : O(n)
SPACE COMPLEXITY : O(1)

*/